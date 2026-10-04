#version 330

// Schematic mismatch-overlay fill (Renderer V2) — fragment stage.
//
// Shares the ghost's uniform block so fill of every kind obeys one interior policy: if ghost models are
// getting out of your way as you step into a wall, the coloured shell quads must do the same, or the
// suppression is only half done and the near surfaces still dominate.
//
// Outlines deliberately do NOT use this shader. Edges are the information layer and must survive at full
// strength exactly where fill is being suppressed.

layout(std140) uniform CorzGhostData {
    vec4  uTint;         // rgb multiplier, a = global fill opacity scale
    float uFadeStart;    // eye distance where the interior fade releases
    float uFadeEnd;      // eye distance where full opacity resumes
    float uMinAlpha;     // opacity floor inside the fade zone (0 = fully clear)
    float uAlphaCutoff;  // unused here; kept so the block layout matches the ghost's
};

in vec4 vertexColor;
in float camDist;

out vec4 fragColor;

void main() {
    vec4 color = vertexColor * vec4(uTint.rgb, 1.0);

    float fade = mix(uMinAlpha, 1.0, smoothstep(uFadeStart, uFadeEnd, camDist));
    color.a *= fade;

    if (color.a < 0.004) {
        discard;
    }

    fragColor = color;
}
