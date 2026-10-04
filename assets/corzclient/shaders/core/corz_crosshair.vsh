#version 330

layout(std140) uniform CorzCrosshair {
    vec2 uScaledRes;
    vec2 uResolution;
    vec2 uCenter;
    vec2 uHalfSize;
    vec4 uColor;
    vec4 uOutlineColor;
    float uRadius;
    float uAngle;
    float uOutline;
    float uInner;
    float uArcHalf;
    float uGlow;
    int uShape;
    int uMode;
};

in vec3 Position;

void main() {
    // Position is in GUI-scaled pixel coords (top-left origin). Map directly to NDC so the draw is
    // independent of global projection / model-view state (same convention as rounded_rect.vsh).
    gl_Position = vec4(Position.x / uScaledRes.x * 2.0 - 1.0,
                       1.0 - Position.y / uScaledRes.y * 2.0,
                       0.0, 1.0);
}
