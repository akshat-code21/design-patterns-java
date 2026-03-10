package sir_notes.PrototypePattern;

import java.awt.*;

final public class TextBox implements Shape {
    private int x, y;
    private final String text;
    private final FillStyle fill;

    public TextBox(String text,  FillStyle fill) {
        this.text = text;
        this.fill = fill;
    }

    @Override
    public Shape copy() {
        return new TextBox(text, fill.copy());
    }

    @Override
    public void draw(Graphics2D g) {
        // draw logic
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return " TextBox (\" " + text + "\") @(" + x + "," + y + ")";
    }
}
