package com.amihaescu.abstraction;

import com.amihaescu.abstraction.makers.implementation.LavazzaEspressoMaker;
import com.amihaescu.abstraction.makers.implementation.LorFlatWhiteMaker;

public class MakingCoffee {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(
                new LavazzaEspressoMaker(),
                new LorFlatWhiteMaker()
        );

        coffeeMachine.makeCoffee(CoffeeType.ESPRESSO, 2);
        coffeeMachine.makeCoffee(CoffeeType.FLAT_WHITE, 1);
    }
}
