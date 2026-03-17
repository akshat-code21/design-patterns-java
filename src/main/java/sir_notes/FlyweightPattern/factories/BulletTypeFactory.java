package sir_notes.FlyweightPattern.factories;

import sir_notes.FlyweightPattern.flyweights.BulletType;
import sir_notes.FlyweightPattern.flyweights.TextureId;

import java.util.HashMap;
import java.util.Map;

public final class BulletTypeFactory {
    private final Map<String, BulletType> cache = new HashMap<>();

    public BulletType get(TextureId tex, double dmg, double speed, int w, int h) {
        String key = tex.name() + " | " + dmg + " | " + speed + " | " + w + " | " + h;
        return cache.computeIfAbsent(key, k -> new BulletType(tex, dmg, speed, w, h));
    }

    public int size() {
        return cache.size();
    }
}
