#version 330

// MSDF text vertex stage. Identical GUI-px -> NDC mapping as corz_textured;
// its own uniform block (CorzMsdf) so it never shares state with the textured/rounded pipelines.
layout(std140) uniform CorzMsdf {
    vec2 uScaledRes;
};

in vec3 Position;
in vec2 UV0;
in vec4 Color;

out vec2 texCoord0;
out vec4 vertexColor;

void main() {
    gl_Position = vec4(Position.x / uScaledRes.x * 2.0 - 1.0,
                       1.0 - Position.y / uScaledRes.y * 2.0,
                       0.0, 1.0);
    texCoord0 = UV0;
    vertexColor = Color;
}
