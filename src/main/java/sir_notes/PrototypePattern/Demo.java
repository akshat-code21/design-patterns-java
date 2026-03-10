package sir_notes.PrototypePattern;

class Demo {
    public static void main(String[] args) {
        ShapeRegistry reg = new ShapeRegistry();
        reg.register(" rect ", new Rectangle(120, 80, new StrokeStyle(2.0f, false), new FillStyle(0xFF3366CC)));

        reg.register(" ellipse ", new Ellipse(60, 40, new StrokeStyle(1.5f, true), new FillStyle(0xAA33CC66)));

        reg.register(" text ", new TextBox(" Hello ", new FillStyle(0xFFFFFFFF)));


        Tool rectTool = new Tool(reg, " rect ");
        Tool textTool = new Tool(reg, " text ");

        System.out.println(rectTool.onClick(100, 100)); // fresh clone
        System.out.println(textTool.onClick(220, 120)); // fresh clone


        // Plugins could : reg . register (" swimlane " , new Swimlane (...) );
        // And tools can immediately use it without code changes elsewhere.

    }
}
