package org.example.FactoryPattern;

public class GreekPizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("preparing greek pizza");
    }

    @Override
    void bake() {
        System.out.println("baking greek pizza");
    }

    @Override
    void cut() {
        System.out.println("cutting greek pizza");
    }

    @Override
    void box() {
        System.out.println("boxing greek pizza");
    }
}
