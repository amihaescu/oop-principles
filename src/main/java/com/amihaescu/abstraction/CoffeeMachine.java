package com.amihaescu.abstraction;

import com.amihaescu.abstraction.coffee.Coffee;
import com.amihaescu.abstraction.makers.EspressoMaker;
import com.amihaescu.abstraction.makers.FlatWhiteMaker;

public class CoffeeMachine {

    private EspressoMaker espressoMaker;
    private FlatWhiteMaker flatWhiteMaker;

    public CoffeeMachine(EspressoMaker espressoMaker, FlatWhiteMaker flatWhiteMaker) {
        this.espressoMaker = espressoMaker;
        this.flatWhiteMaker = flatWhiteMaker;
    }

    public Coffee makeCoffee(CoffeeType type, Integer sugarAmount) {
        switch (type) {
            case ESPRESSO:
                return espressoMaker.makeCoffee(sugarAmount);
            case FLAT_WHITE:
                return flatWhiteMaker.makeCoffee(sugarAmount);
            default:
                throw new IllegalArgumentException();
        }
    }
}
