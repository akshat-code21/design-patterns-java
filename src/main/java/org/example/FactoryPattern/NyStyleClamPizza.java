package org.example.FactoryPattern;

public class NyStyleClamPizza extends Pizza{
    public NyStyleClamPizza() {
        name = "NY Style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Clam");
    }
}
