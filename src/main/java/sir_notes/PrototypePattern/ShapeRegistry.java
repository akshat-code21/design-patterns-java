package sir_notes.PrototypePattern;

import java.util.HashMap;
import java.util.Map;

final public class ShapeRegistry {
    private final Map<String,Shape> store = new HashMap<>();
    public void register(String key,Shape proto){
        store.put(key.toLowerCase(),proto);
    }
    public void unregister(String key){
        store.remove(key.toLowerCase());
    }
    public Shape create(String key){
        Shape p = store.get(key.toLowerCase());
        if(p == null) throw new IllegalArgumentException("Unknown: " + key);
        return p.copy();
    }
}
