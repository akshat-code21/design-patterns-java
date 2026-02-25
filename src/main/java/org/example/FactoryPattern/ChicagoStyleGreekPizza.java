package org.example.FactoryPattern;

public class ChicagoStyleGreekPizza extends Pizza{
    public ChicagoStyleGreekPizza() {
        name = "Chicago Style Deep Dish Greek Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Greek");
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
