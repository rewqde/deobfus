#version 330

// Schematic ghost (Renderer V2) — fragment stage.
//
// Everything that varies per frame lives in this UBO rather than in the vertex data, so changing opacity,
// tint or the interior-fade radius never invalidates a baked section mesh.
//
// uFadeStart/uFadeEnd implement the interior clarity ramp: fragments closer to the eye than uFadeStart are
// held at uMinAlpha, fragments past uFadeEnd render at full configured opacity, and smoothstep carries the
// transition between them so walking through a wall fades it out instead of popping it.

layout(std140) uniform CorzGhostData {
    vec4  uTint;         // rgb multiplier, a = global ghost opacity
    float uFadeStart;    // eye distance where the interior fade releases
    float uFadeEnd;      // eye distance where full opacity resumes
    float uMinAlpha;     // opacity floor inside the fade zone (0 = fully clear)
    float uAlphaCutoff;  // texel alpha below this is discarded (cutout foliage/glass panes)
};

uniform sampler2D Sampler0;

in vec4 vertexColor;
in vec2 texCoord0;
in float camDist;

out vec4 fragColor;

void main() {
    vec4 texel = texture(Sampler0, texCoord0);

    // Cutout test on the TEXTURE's own alpha, before ghost opacity is applied — matching vanilla's
    // entity.fsh ordering. Testing after the tint would erase whole blocks as the user lowered opacity.
    if (texel.a < uAlphaCutoff) {
        discard;
    }

    vec4 color = texel * vertexColor * uTint;

    float fade = mix(uMinAlpha, 1.0, smoothstep(uFadeStart, uFadeEnd, camDist));
    color.a *= fade;

    // Fully-faded fragments still cost blending and (on depth-writing passes) still occlude. Dropping them
    // keeps the camera cell from stamping an invisible depth hole over the geometry behind it.
    if (color.a < 0.004) {
        discard;
    }

    fragColor = color;
}
