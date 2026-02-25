package org.example.FactoryPattern;

public class NyStyleGreekPizza extends Pizza{
    public NyStyleGreekPizza() {
        name = "NY Style Sauce and Greek Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Greek");
    }
}
