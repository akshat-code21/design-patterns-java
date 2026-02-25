package org.example.FactoryPattern;

public class NyStyleVeggiePizza extends Pizza{
    public NyStyleVeggiePizza() {
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Veggie");
    }
}
