package sir_notes.FactoryPattern.SimpleFactory;

final class StoneFactory {
    private StoneFactory () {}
    public static Stone createAndGetStone(StoneType type){
        return switch (type){
            case SMALL -> new SmallStone();
            case MEDIUM -> new MediumStone();
            case LARGE -> new LargeStone();
        };
    }
}
