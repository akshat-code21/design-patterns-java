package org.example.FactoryPattern;

public class NyPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new NyPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new CheesePizza(factory);
        }else if(type.equals("clam")){
            pizza = new ClamPizza(factory);
        }else if(type.equals("greek")){
            pizza = new GreekPizza(factory);
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza(factory);
        }
        return pizza;
    }
}
