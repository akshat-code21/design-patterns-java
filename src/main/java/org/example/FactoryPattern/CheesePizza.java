package org.example.FactoryPattern;

public class CheesePizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("preparing cheese pizza");
    }

    @Override
    void bake() {
        System.out.println("baking cheese pizza");
    }

    @Override
    void cut() {
        System.out.println("cutting cheese pizza");
    }

    @Override
    void box() {
        System.out.println("boxing cheese pizza");
    }
}
