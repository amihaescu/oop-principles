package com.amihaescu.abstraction;

import com.amihaescu.abstraction.coffee.Coffee;

public class TestCoffee extends Coffee {

    public TestCoffee(Integer sugarLevel, String brand) {
        super(sugarLevel, brand);
    }

    @Override
    public String getDescription() {
        return "Test coffee";
    }
}
