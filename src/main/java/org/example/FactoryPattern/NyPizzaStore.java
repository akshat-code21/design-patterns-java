package org.example.FactoryPattern;

public class NyPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NyStyleCheesePizza();
        }else if(type.equals("clam")){
            pizza = new NyStyleClamPizza();
        }else if(type.equals("veggie")){
            pizza = new NyStyleVeggiePizza();
        }else if(type.equals("greek")){
            pizza = new NyStyleGreekPizza();
        }
        return pizza;
    }
}
