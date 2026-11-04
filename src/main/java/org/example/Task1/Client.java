package org.example.Task1;


/**
 * TODO:
 *
 * Task 1: Builder
 * - Create package Example1.
 * - Refactor the existing pizza classes into a Builder pattern so clients can
 * - configure cheese and crust without creating many Pizza subclasses.
 *
 * Task 2: Adapter
 * - Create package Example2.
 * - The pizza shop is out of pizzas, so you must order from Domino's instead.
 * - DominoPizza has an incompatible interface that cannot be modified.
 * - Create an Adapter so your existing Pizza Builder can work with DominoPizza.
 *
 * Task 3: Decorator
 * - Create package Example3.
 * - After the pizza has been built, allow customers to add optional toppings.
 * - Create decorators such as OnionDecorator and PineappleDecorator and support
 *   combining multiple toppings on the same pizza.
 * - For adding additional toppings...
 */
public class Client {
    public static void main (String [] args){

    }
}

class Cheese{}
class ThickCrust{}
class ThinCrust{}


class PizzaWithOutCheeseAndThickCrust{
    public void setCrust(ThickCrust thickCrust){

    }
}

class PizzaWithCheeseAndThickCrust{
    public void setCheese(Cheese cheese){
    }
    public void setCrust(ThickCrust crust){

    }
}
class PizzaWithWithCheeseAndThinCrust{
    public void setCheese(Cheese cheese) {

    }
    public void setCrust(ThinCrust crust) {

    }
}

