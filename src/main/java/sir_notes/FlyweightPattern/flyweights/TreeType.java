package sir_notes.FlyweightPattern.flyweights;

public class TreeType {
    public final MeshId mesh;
    public final TextureId bark, leaves;
    public final double trunkRadius;
    public final double baseWindResponse; // shader param

    public TreeType(MeshId mesh, TextureId bark, TextureId leaves, double trunkRadius, double baseWindResponse) {
        this.mesh = mesh;
        this.bark = bark;
        this.leaves = leaves;
        this.trunkRadius = trunkRadius;
        this.baseWindResponse = baseWindResponse;
    }
}
