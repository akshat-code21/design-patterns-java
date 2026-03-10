package sir_notes.FactoryPattern.FactoryMethod;

import sir_notes.FactoryPattern.SimpleFactory.Stone;

import java.util.ArrayList;
import java.util.List;

abstract class StoneSpawner {
    protected abstract Stone createStone();

    public final List<Stone> generateWave(int count) {
        List<Stone> wave = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            Stone s = createStone(); // <-- polymorphic creation
            wave.add(s);
        }
        // could enforce cooldowns , caps , logging here
        return wave;
    }
}
