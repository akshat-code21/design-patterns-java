package sir_notes.FactoryPattern.SimpleFactory;

public final class MediumStone implements Stone{
    @Override
    public String size() {
        return "MEDIUM";
    }

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public double weight() {
        return 2.5;
    }
}
