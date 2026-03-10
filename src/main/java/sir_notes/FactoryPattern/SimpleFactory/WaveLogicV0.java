package sir_notes.FactoryPattern.SimpleFactory;

public class WaveLogicV0 {
    Stone spawnStones(StoneType type){
        return StoneFactory.createAndGetStone(type); // gameplay is decoupled from concretes
    }
}
