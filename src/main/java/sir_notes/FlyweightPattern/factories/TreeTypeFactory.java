package sir_notes.FlyweightPattern.factories;

import sir_notes.FlyweightPattern.flyweights.MeshId;
import sir_notes.FlyweightPattern.flyweights.TextureId;
import sir_notes.FlyweightPattern.flyweights.TreeType;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
    private final Map<String, TreeType> cache = new HashMap<>();

    public TreeType get(MeshId mesh, TextureId bark, TextureId leaves, double radius, double wind) {
        String key = mesh.name() + " | " + bark.name() + " | " + leaves.name() + " | " + radius + " | " + wind;
        return cache.computeIfAbsent(key, k -> new TreeType(mesh, bark, leaves,
                radius, wind));
    }
}
