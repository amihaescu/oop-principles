package com.amihaescu.abstraction;

import com.amihaescu.abstraction.makers.TestEspressoMaker;
import com.amihaescu.abstraction.makers.TestFlatWhiteMaker;
import org.junit.jupiter.api.Test;

import static com.amihaescu.abstraction.CoffeeType.AMERICANO;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeMachineTest {

    private CoffeeMachine coffeeMachine = new CoffeeMachine(
            new TestEspressoMaker(),
            new TestFlatWhiteMaker()
    );

    @Test
    void makeAmericano() {
        Coffee coffee = coffeeMachine.makeCoffee(AMERICANO, 0);
        assertEquals(AMERICANO, coffee.getCoffeeType());
        assertEquals(0, coffee.getSugarLevel());
    }

}
