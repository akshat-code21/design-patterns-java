package sir_notes.FactoryPattern.FactoryMethod;

import sir_notes.FactoryPattern.SimpleFactory.LargeStone;
import sir_notes.FactoryPattern.SimpleFactory.MediumStone;
import sir_notes.FactoryPattern.SimpleFactory.SmallStone;
import sir_notes.FactoryPattern.SimpleFactory.Stone;

public class EqualizedStoneSpawner extends StoneSpawner {
    private int idx = 0;

    @Override
    protected Stone createStone() {
        Stone s = switch (idx) {
            case 0 -> new SmallStone();
            case 1 -> new MediumStone();
            default -> new LargeStone();
        };
        idx = (idx + 1) % 3;
        return s;
    }
}
