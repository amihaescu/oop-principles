package com.amihaescu.abstraction.makers;

import com.amihaescu.abstraction.TestCoffee;
import com.amihaescu.abstraction.coffee.Coffee;

public class TestEspressoMaker implements EspressoMaker{

    private static final String brand = "Test espresso maker";
    @Override
    public Coffee makeCoffee(Integer sugarLevel) {
        return new TestCoffee(sugarLevel, brand);
    }
}
