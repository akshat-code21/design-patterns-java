package org.example.FactoryPattern;

public class ClamPizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("preparing clam pizza");
    }

    @Override
    void bake() {
        System.out.println("baking clam pizza");
    }

    @Override
    void cut() {
        System.out.println("cutting clam pizza");
    }

    @Override
    void box() {
        System.out.println("boxing clam pizza");
    }
}
