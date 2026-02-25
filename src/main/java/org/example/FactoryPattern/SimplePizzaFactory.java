package org.example.FactoryPattern;

public class SimplePizzaFactory {
    Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("clam")){
            pizza = new ClamPizza();
        }else if(type.equals("greek")){
            pizza = new GreekPizza();
        } else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
