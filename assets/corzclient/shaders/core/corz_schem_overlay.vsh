#version 330

// Schematic mismatch-overlay fill (Renderer V2) — vertex stage.
//
// Same trick as the ghost shader: section meshes are baked anchor-relative, so the eye distance has to come
// from the view-space position rather than from the raw vertex attribute. Without this the coloured shell
// quads stayed at full strength right against the camera while the ghost models around them faded, which is
// most of what made standing inside a build read as blue soup.

#moj_import <minecraft:dynamictransforms.glsl>
#moj_import <minecraft:projection.glsl>

in vec3 Position;
in vec4 Color;

out vec4 vertexColor;
out float camDist;

void main() {
    vec4 view = ModelViewMat * vec4(Position, 1.0);
    gl_Position = ProjMat * view;

    camDist = length(view.xyz);
    vertexColor = Color;
}
