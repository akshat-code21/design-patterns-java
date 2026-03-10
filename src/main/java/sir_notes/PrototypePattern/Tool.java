package sir_notes.PrototypePattern;

final public class Tool {
    private final ShapeRegistry shapeRegistry;
    private final String key;
    public Tool(ShapeRegistry shapeRegistry,String key) {
        this.shapeRegistry = shapeRegistry;
        this.key = key;
    }
    public Shape onClick(int x,int y){
        Shape s = shapeRegistry.create(key);
        s.setPosition(x,y);
        return s;
    }
}
