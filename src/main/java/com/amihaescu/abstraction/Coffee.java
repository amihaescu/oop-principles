package com.amihaescu.abstraction;

public class Coffee {

    private CoffeeType coffeeType;
    private Integer sugarLevel;

    public Coffee(CoffeeType coffeeType, Integer sugarLevel) {
        this.coffeeType = coffeeType;
        this.sugarLevel = sugarLevel;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public Integer getSugarLevel() {
        return sugarLevel;
    }
}
