package sir_notes.FlyweightPattern.factories;

import sir_notes.FlyweightPattern.flyweights.TextureId;
import sir_notes.FlyweightPattern.flyweights.TileType;

import java.util.HashMap;
import java.util.Map;

public final class TileTypeFactory {
    private final Map<String, TileType> cache = new HashMap<>();

    public TileType get(TextureId atlas, int x, int y, boolean blockM, boolean blockV) {
        String key = atlas.name() + " | " + x + " | " + y + " | " + (blockM ? 1 : 0) + " | " + (blockV ? 1 : 0);
        return cache.computeIfAbsent(key, k -> new TileType(atlas, x, y, blockM, blockV));
    }
}

