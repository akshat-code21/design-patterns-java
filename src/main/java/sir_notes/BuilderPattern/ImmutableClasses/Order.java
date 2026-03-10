package sir_notes.BuilderPattern.ImmutableClasses;

import java.util.Collections;
import java.util.List;

public final class Order {
    private final List<String> items;

    public Order(List<String> items) {
//        this.items = items; // Dangerous! Since we only copy reference
        this.items = List.copyOf(items); // defensive copy
    }

    public List<String> getItems() {
//        return items;
        return Collections.unmodifiableList(items); // safe viewing
    }
}


/*
A caller can do :

List<String> list = new ArrayList<>();
list.add("TV");
Order o = new Order(list);
list.add("Radio");

SO, TO PREVENT THIS WE DO DEFENSIVE COPYING
 */