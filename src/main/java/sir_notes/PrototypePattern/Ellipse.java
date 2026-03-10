package sir_notes.PrototypePattern;

import java.awt.*;

final public class Ellipse implements Shape{
    private int cx,cy,rx,ry;
    private final StrokeStyle stroke;
    private final FillStyle fill;
    public Ellipse(int rx,int ry,StrokeStyle stroke,FillStyle fill){
        this.rx = rx;
        this.ry = ry;
        this.stroke = stroke;
        this.fill = fill;
    }

    @Override
    public Shape copy() {
        return new Ellipse(rx,ry,stroke.copy(),fill.copy());
    }

    @Override
    public void draw(Graphics2D g) {
        // draw logic
    }

    @Override
    public void setPosition(int x, int y) {
        this.cx = x;
        this.cy = y;
    }
    public String toString () {
        return " Ellipse (r=" + rx + "," + ry + ")@(" + cx + ", " + cy + ")";
    }
}
