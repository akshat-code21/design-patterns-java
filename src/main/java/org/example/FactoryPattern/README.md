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
All products must implement the same interface so that the classes which 
use the products can refer to the interface, not the concrete class.
```

# Abstract Factory Pattern

# The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.


```
The AbstractFactory defines the interface that all Concrete factories must implement, which consists of a set of methods for producing products.

The Client is written against the abstract factory and then composed at runtime with an actual factory.


[ The abstract PizzaIngredientFactory is the interface that defines how to make a family of related products - everything we need to make a pizza.]
[ The clients of the Abstract Factory are the concrete instances of the Pizza abstract class. ]
```

```
AbstractProductA is the product family. Each concrete factory can produce an entire set of products

[Each factory produces a different implementation for the family of products.]
```

``` 
The concrete factories implement the different product families. To create a product, the client uses one of these factories, so it never has to instantiate a product object.

[The job of the concrete pizza factories is to make pizza ingredients. Each factory knows how to create the right objects for their region.]
```



## Abstract Factory: Use me whenever you have families of products you need to create, and you want to make sure your clients create products that belong together.

## Factory Method: use me to decouple your client code from the concrete classes you need to instantiate, or if you don’t know ahead of time all the concrete classes you are going to need. To use me, just subclass me and implement my factory method!