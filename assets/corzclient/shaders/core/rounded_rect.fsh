#version 330

layout(std140) uniform CorzRoundedRect {
    vec2 uScaledRes;
    vec2 uResolution;
    vec2 uPosition;
    vec2 uSize;
    float uRadius;
    float uStroke;
    vec4 uColor;
};

out vec4 fragColor;

const float edgeSoftness = 2.0;

float roundedBoxSDF(vec2 centerPosition, vec2 size, float radius) {
    return length(max(abs(centerPosition) - size + radius, 0.0)) - radius;
}

void main() {
    vec2 _position = vec2(uPosition.x, uResolution.y - uPosition.y);

    vec2 size05 = uSize / 2.0;
    float distance = roundedBoxSDF(vec2(gl_FragCoord.x - size05.x, gl_FragCoord.y + size05.y) - _position, size05, uRadius);

    float alpha = uColor.a - smoothstep(0.0, edgeSoftness, distance);
    // Ring mode (uStroke > 0, framebuffer px): fade the colour back out over uStroke px INSIDE the edge so
    // only a hairline survives -- the same profile the old "fill inset 1px over an edge-coloured backing"
    // trick produced, but drawable OVER a translucent fill without tinting its body.
    if (uStroke > 0.0) {
        alpha *= smoothstep(-uStroke, -uStroke + edgeSoftness, distance);
    }
    fragColor = vec4(uColor.r, uColor.g, uColor.b, alpha);
}
