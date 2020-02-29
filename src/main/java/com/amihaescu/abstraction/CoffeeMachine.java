package com.amihaescu.abstraction;

public class CoffeeMachine {


    public Coffee makeCoffee(CoffeeType type, Integer sugarAmount) {

        return new Coffee(type, sugarAmount);
    }
}
