# Factory Pattern

# The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

## In our case: `Pizza` was the `Product` class and `NyStyleCheesePizza` was a `Concrete Product`. `PizzaStore` was the `Creator` class which defined an abstract factory method `createPizza(String type)` and `NyPizzaStore` which had implementation of `createPizza()` was a `Concrete Creator`

```
The Creator is a class that contains the implementations for all of the methods to manipulate products, except for the factory method.

The abstract factoryMethod() is what all Creator subclasses must implement.
```


```
The ConcreteCreator implements the factoryMethod(), which is the method that actually produces products.

The ConcreteCreator is responsible for creating one or more concrete products. It is the only class that has the knowledge of how to create these products.
```


```
All products must implement the same interface so that the classes which use the products can refer to the interface, not the concrete class.
``