#version 330

// Schematic ghost (Renderer V2) — vertex stage.
//
// The section meshes this draws are baked ANCHOR-RELATIVE so they survive camera motion without a
// rebuild, which means the vanilla entity shader's `length(Position)` fog distance would measure from the
// mesh anchor, not from the eye. We therefore carry the view-space position ourselves: ModelViewMat maps
// whatever space the vertices are in into view space, where the camera sits at the origin, so
// length(view.xyz) is the true eye distance for any vertex space. That distance drives the near-camera
// fade in the fragment stage, which is what lets the player stand inside a build without a ghost cube
// welded to the lens.

#moj_import <minecraft:dynamictransforms.glsl>
#moj_import <minecraft:projection.glsl>

// POSITION_COLOR_TEXTURE_LIGHT_NORMAL — the terrain format, because these meshes are tessellated through
// BlockRenderManager.renderBlock (the chunk path). There is deliberately no UV1/overlay element here.
in vec3 Position;
in vec4 Color;
in vec2 UV0;
in ivec2 UV2;
in vec3 Normal;

out vec4 vertexColor;
out vec2 texCoord0;
out float camDist;

void main() {
    vec4 view = ModelViewMat * vec4(Position, 1.0);
    gl_Position = ProjMat * view;

    camDist = length(view.xyz);
    vertexColor = Color;
    texCoord0 = UV0;
}
