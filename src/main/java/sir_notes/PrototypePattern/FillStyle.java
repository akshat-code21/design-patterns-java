package sir_notes.PrototypePattern;

final public class FillStyle {
    final int rgba; // ARGB

    FillStyle(int rgba) {
        this.rgba = rgba;
    }

    FillStyle copy() {
        return new FillStyle(rgba);
    }
}
