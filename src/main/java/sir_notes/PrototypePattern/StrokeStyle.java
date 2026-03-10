package sir_notes.PrototypePattern;

final public class StrokeStyle {
    final float width;
    final boolean dashed;

    StrokeStyle(float w, boolean d) {
        this.width = w;
        this.dashed = d;
    }

    StrokeStyle copy() {
        return new StrokeStyle(width, dashed);
    }
}
