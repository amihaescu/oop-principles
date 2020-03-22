package com.amihaescu.abstraction.makers.implementation;

import com.amihaescu.abstraction.coffee.Coffee;
import com.amihaescu.abstraction.coffee.Espresso;
import com.amihaescu.abstraction.makers.EspressoMaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LavazzaEspressoMaker implements EspressoMaker {

    private static final Logger LOGGER = LoggerFactory.getLogger(LavazzaEspressoMaker.class);
    private static final String brand = "Lavazza";

    @Override
    public Coffee makeCoffee(Integer sugarLevel) {
        LOGGER.info("Making lavazza espresso with {} sugar(s)", sugarLevel);
        return new Espresso(sugarLevel, brand);
    }
}
