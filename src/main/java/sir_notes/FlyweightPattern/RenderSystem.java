package sir_notes.FlyweightPattern;

import sir_notes.FlyweightPattern.flyweights.BulletType;
import sir_notes.FlyweightPattern.flyweights.TileType;
import sir_notes.FlyweightPattern.lightweight.Bullet;
import sir_notes.FlyweightPattern.lightweight.Tile;
import sir_notes.FlyweightPattern.lightweight.Tree;

public final class RenderSystem {
    public void drawBullet(Graphics g, Bullet b, float rotation) {
        BulletType t = b.type; // shared
        g.drawSprite(t.texture, t.spriteW, t.spriteH, b.x, b.y, rotation);
    }

    public void drawTree(Graphics g, Tree t) {
        g.drawMesh(t.type.mesh, t.type.bark, t.type.leaves, t.x, t.y, t.z, t.scale, (float) (t.windPhase * t.type.baseWindResponse));
    }

    public void drawTile(Graphics g, Tile tile) {
        TileType t = tile.type;
        g.drawTile(t.atlas, t.atlasX, t.atlasY, tile.gx, tile.gy);
    }
}