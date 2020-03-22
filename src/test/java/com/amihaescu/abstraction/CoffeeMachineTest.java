package com.amihaescu.abstraction;

import com.amihaescu.abstraction.coffee.Coffee;
import com.amihaescu.abstraction.makers.TestEspressoMaker;
import com.amihaescu.abstraction.makers.TestFlatWhiteMaker;
import org.junit.jupiter.api.Test;

import static com.amihaescu.abstraction.CoffeeType.ESPRESSO;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeMachineTest {

    private CoffeeMachine coffeeMachine = new CoffeeMachine(
            new TestEspressoMaker(),
            new TestFlatWhiteMaker()
    );

    @Test
    void makeAmericano() {
        Coffee coffee = coffeeMachine.makeCoffee(ESPRESSO, 0);
        assertEquals(0, coffee.getSugarLevel());
        assertEquals("Test espresso maker", coffee.getBrand());
    }

}
