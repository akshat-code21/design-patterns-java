package org.example.FactoryPattern;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println("I ordered a " + nyPizza.getName() + "\n");

        Pizza chicagoPizza = chicagoStore.orderPizza("clam");
        System.out.println("Harry order a " + chicagoPizza.getName() + "\n");
    }
}
