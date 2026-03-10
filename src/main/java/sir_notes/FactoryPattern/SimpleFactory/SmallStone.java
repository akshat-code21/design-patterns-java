package sir_notes.FactoryPattern.SimpleFactory;

public final class SmallStone implements Stone{

    @Override
    public String size() {
        return "SMALL";
    }

    @Override
    public int damage() {
        return 5;
    }

    @Override
    public double weight() {
        return 1.0;
    }
}
