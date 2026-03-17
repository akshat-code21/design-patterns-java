package sir_notes.FlyweightPattern;

import sir_notes.FlyweightPattern.flyweights.MeshId;
import sir_notes.FlyweightPattern.flyweights.TextureId;

public interface Graphics {
    void drawSprite(TextureId tex, int spriteW, int spriteH, float x, float y, float rotation);
    void drawMesh(MeshId mesh, TextureId bark, TextureId leaves, float x, float y, float z, float scale, float wind);
    void drawTile(TextureId atlas, int atlasX, int atlasY, int gx, int gy);
}
