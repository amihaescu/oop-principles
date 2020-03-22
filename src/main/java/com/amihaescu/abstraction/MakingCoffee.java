package com.amihaescu.abstraction;

import com.amihaescu.abstraction.coffee.Coffee;
import com.amihaescu.abstraction.makers.implementation.LavazzaEspressoMaker;
import com.amihaescu.abstraction.makers.implementation.LorFlatWhiteMaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class MakingCoffee {

    private static final Logger LOGGER = LoggerFactory.getLogger(MakingCoffee.class);
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(
                new LavazzaEspressoMaker(),
                new LorFlatWhiteMaker()
        );
        List<Coffee> order = new ArrayList<>();
        order.add(coffeeMachine.makeCoffee(CoffeeType.ESPRESSO, 2));
        order.add(coffeeMachine.makeCoffee(CoffeeType.FLAT_WHITE, 1));
        order.stream().map(Coffee::getDescription).forEach(LOGGER::info);
    }
}
