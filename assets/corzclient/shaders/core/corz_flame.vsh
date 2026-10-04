#version 330

layout(std140) uniform CorzFlame {
    vec2 uScaledRes;   // GUI-scaled resolution (vertex mapping)
    vec2 uResolution;  // framebuffer resolution (fragment gl_FragCoord space)
    vec4 uPrimary;     // outer flame colour (rgb) + alpha multiplier (a)
    vec4 uSecondary;   // inner core colour (rgb)
    vec4 uParamsA;     // x=time  y=opacity      z=flameHeight  w=animSpeed
    vec4 uParamsB;     // x=intensity y=glow     z=centerClear  w=bottomFade
    vec4 uParamsC;     // x=style y=fadeAlpha    z=aspect       w=stripTop
};

in vec3 Position;

void main() {
    // Position is in GUI-scaled pixel coords (top-left origin). Map straight to NDC so the draw is
    // independent of the global projection / model-view state (matches the other Corz GUI pipelines).
    gl_Position = vec4(Position.x / uScaledRes.x * 2.0 - 1.0,
                       1.0 - Position.y / uScaledRes.y * 2.0,
                       0.0, 1.0);
}
