package sir_notes.PrototypePattern;

public interface Shape {
    Shape copy();
    void draw(java.awt.Graphics2D g);
    void setPosition (int x , int y );
}
