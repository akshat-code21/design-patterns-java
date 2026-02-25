package org.example.FactoryPattern;

public class VeggiePizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("preparing veggie pizza");
    }

    @Override
    void bake() {
        System.out.println("baking veggie pizza");
    }

    @Override
    void cut() {
        System.out.println("cutting veggie pizza");
    }

    @Override
    void box() {
        System.out.println("boxing veggie pizza");
    }
}
