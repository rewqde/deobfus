#version 330

// Low-profile, GPU-cheap first-person flame. One pass, one draw call, drawn only across a bottom strip
// (the quad already excludes the upper screen, so the centre/crosshair region runs no flame fragments at
// full height). Everything is procedural: a couple of drifting value-noise octaves sharpened into pointed
// flame tips, a protected central vision zone, a hot inner core, a soft local edge glow (no framebuffer
// bloom) and clean vertical + bottom-edge fades. No loops, no texture fetches, no world sampling.

layout(std140) uniform CorzFlame {
    vec2 uScaledRes;
    vec2 uResolution;
    vec4 uPrimary;
    vec4 uSecondary;
    vec4 uParamsA;   // x=time  y=opacity      z=flameHeight  w=animSpeed
    vec4 uParamsB;   // x=intensity y=glow     z=centerClear  w=bottomFade
    vec4 uParamsC;   // x=style y=fadeAlpha    z=aspect       w=stripTop
};

out vec4 fragColor;

// cheap 1D hash + value noise
float hash11(float p) {
    p = fract(p * 0.1031);
    p *= p + 33.33;
    p *= p + p;
    return fract(p);
}
float vnoise(float x) {
    float i = floor(x);
    float f = fract(x);
    float u = f * f * (3.0 - 2.0 * f);
    return mix(hash11(i), hash11(i + 1.0), u);
}

// Mirrors CustomFlameMath.centerClearMultiplier (the JVM-tested reference for this curve).
float centerClear(float uvx, float cc) {
    float e = abs(uvx - 0.5) * 2.0;
    float zone = smoothstep(0.15, 0.75, e);
    float floorv = max(0.0, 1.0 - cc * 1.6);
    return mix(floorv, 1.0, zone);
}

void main() {
    vec2 uv = gl_FragCoord.xy / uResolution;   // origin bottom-left: uv.y = 0 at the screen's bottom edge
    float stripTop = uParamsC.w;
    if (uv.y > stripTop) { discard; }          // never touch fragments above the flame band

    float time      = uParamsA.x;
    float opacity   = uParamsA.y;
    float height    = uParamsA.z;
    float speed     = uParamsA.w;
    float intensity = uParamsB.x;
    float glowStr   = uParamsB.y;
    float cc        = uParamsB.z;
    float bottom    = uParamsB.w;
    float style     = uParamsC.x;
    float fade      = uParamsC.y;
    float aspect    = uParamsC.z;

    // Per-style shaping. These read a uniform, so every fragment takes the same branch (no divergence).
    float sharpen      = 2.0;
    float ampScale     = 1.0;
    float alphaScale   = 1.0;
    float tipSoft      = 0.045;
    float noiseAmt     = 1.0;
    float coreStrength = 0.85;
    float topFade      = 0.55;
    if (style > 1.5) {            // Sharp — angular pointed peaks, higher contrast, still low
        sharpen = 3.4; tipSoft = 0.022; coreStrength = 1.0; topFade = 0.35; noiseAmt = 1.05;
    } else if (style > 0.5) {     // Minimal — very low, transparent and calm
        sharpen = 1.7; ampScale = 0.72; alphaScale = 0.70; tipSoft = 0.07;
        coreStrength = 0.55; topFade = 0.70; noiseAmt = 0.70;
    }

    float t  = time * speed;
    float nx = uv.x * aspect;     // aspect-correct so lobes keep their proportions on any screen

    // Drifting height field: two moving octaves + a slow large-scale envelope for mild asymmetry.
    float n = vnoise(nx * 3.3 + t * 0.70);
    n = n * 0.65 + vnoise(nx * 7.7 - t * 1.13) * 0.35;
    float env = 0.55 + 0.45 * vnoise(nx * 1.3 + t * 0.23);
    n = mix(0.5, n, noiseAmt) * env;
    n = clamp(n + 0.015 * sin(uv.x * 6.2831 + t * 1.7), 0.0, 1.0);   // subtle horizontal sway

    // Intensity controls density/peak strength: raise the continuous base and fatten the lobes.
    float dens  = clamp((intensity - 0.2) / 1.3, 0.0, 1.0);
    n = max(n, 0.12 * dens);
    float shp   = max(0.8, sharpen - dens * 0.8);
    float shape = pow(n, shp);                                       // pointed flame tips

    float ccMul = centerClear(uv.x, cc);
    float top   = height * ampScale * shape * ccMul * mix(0.9, 1.25, dens);

    // Pointed inside/tip mask: 1 well below the tip, → 0 at the tip over tipSoft.
    float d    = top - uv.y;
    float mask = smoothstep(0.0, tipSoft, d);

    // Vertical fade (brighter at the base, dimmer at the tips).
    float vy    = clamp(uv.y / max(top, 1e-4), 0.0, 1.0);
    float vfade = 1.0 - vy * topFade;

    // Bottom fade: ease in from the very screen edge for a darker, transparent base.
    float bfade = smoothstep(0.0, max(1e-4, bottom * 0.12 + 0.006), uv.y);
    bfade = mix(1.0, bfade, clamp(bottom, 0.0, 1.0));

    float bodyAlpha = mask * vfade * bfade;

    // Cheap local edge glow just above the tips — a mathematical halo, never a framebuffer blur.
    float above = uv.y - top;
    float glow  = 0.0;
    if (glowStr > 0.0 && top > 0.001) {
        float gw = 0.02 + 0.05 * glowStr;
        glow = exp(-max(above, 0.0) / gw) * glowStr * 0.6;
        glow *= smoothstep(0.0, tipSoft * 2.0, max(above, -d));
    }

    float a = max(bodyAlpha, glow) * opacity * alphaScale * fade * uPrimary.a;
    if (a <= 0.002) { discard; }

    // Colour: primary outer → hotter secondary inner core (deep inside + near the base).
    float core = clamp(smoothstep(0.35, 1.0, mask) * (1.0 - vy) * coreStrength, 0.0, 1.0);
    vec3 col = mix(uPrimary.rgb, uSecondary.rgb, core);
    col = mix(col, uSecondary.rgb, clamp(glow, 0.0, 1.0) * 0.3);     // hot edge tint

    // Standard (non-premultiplied) alpha to match BlendFunction.TRANSLUCENT.
    fragColor = vec4(col, a);
}
