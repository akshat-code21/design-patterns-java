package sir_notes.PrototypePattern;

import java.awt.*;

final public class Rectangle implements Shape{
    private int x,y,w,h;
    private final StrokeStyle stroke;
    private final FillStyle fill;

    public Rectangle(int w,int h,StrokeStyle stroke,FillStyle fill){
        this.w = w;
        this.h = h;
        this.stroke = stroke;
        this.fill = fill;
    }

    @Override
    public Shape copy() {
        return new Rectangle(w,h,stroke.copy(),fill.copy());
    }

    @Override
    public void draw(Graphics2D g) {
        // draw rect with stroke / fill
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString () {
        return " Rect ("+ w +"x"+ h +")@("+ x +","+ y +")";
    }
}
