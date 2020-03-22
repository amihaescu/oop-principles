package com.amihaescu.abstraction.coffee;

public class Espresso extends Coffee {

    public Espresso(Integer sugarLevel, String brand) {
        super(sugarLevel, brand);
    }

    @Override
    public String getDescription() {
        return "Espresso is a coffee-making method of Italian origin, in which a small amount of nearly boiling water is forced under pressure (expressed) through finely-ground coffee beans. ";
    }
}
