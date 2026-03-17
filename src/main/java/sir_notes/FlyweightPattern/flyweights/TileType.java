package sir_notes.FlyweightPattern.flyweights;

public final class TileType {
    public final TextureId atlas;
    public final int atlasX, atlasY; // UV tile coords
    public final boolean blocksMovement;
    public final boolean blocksVision;

    public TileType(TextureId atlas, int atlasX, int atlasY, boolean blocksMovement, boolean blocksVision) {
        this.atlas = atlas;
        this.atlasX = atlasX;
        this.atlasY = atlasY;
        this.blocksMovement = blocksMovement;
        this.blocksVision = blocksVision;
    }
}