package sir_notes.FactoryPattern.FactoryMethod;

import sir_notes.FactoryPattern.SimpleFactory.LargeStone;
import sir_notes.FactoryPattern.SimpleFactory.MediumStone;
import sir_notes.FactoryPattern.SimpleFactory.SmallStone;
import sir_notes.FactoryPattern.SimpleFactory.Stone;

import java.util.concurrent.ThreadLocalRandom;

public class RandomStoneSpawner extends StoneSpawner{

    @Override
    protected Stone createStone() {
        int pick = ThreadLocalRandom.current().nextInt(3);
        return switch (pick){
            case 0 -> new SmallStone();
            case 1 ->  new MediumStone();
            default -> new LargeStone();
        };
    }
}
