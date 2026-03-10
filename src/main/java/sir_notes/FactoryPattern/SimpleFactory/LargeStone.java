package sir_notes.FactoryPattern.SimpleFactory;

public final class LargeStone implements Stone {
    @Override
    public String size() {
        return "LARGE";
    }

    @Override
    public int damage() {
        return 18;
    }

    @Override
    public double weight() {
        return 4.0;
    }
}
