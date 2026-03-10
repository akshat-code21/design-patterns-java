package sir_notes.FactoryPattern.FactoryMethod;

public class WaveLogicV1 {
    public static void main(String[] args) {
        StoneSpawner random = new RandomStoneSpawner();
        StoneSpawner equal = new EqualizedStoneSpawner();

        System.out.println(" Random : " + random.generateWave(9));
        System.out.println(" Equalized : " + equal.generateWave(9));
    }
}
