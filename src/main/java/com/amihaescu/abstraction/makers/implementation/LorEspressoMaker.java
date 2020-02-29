package com.amihaescu.abstraction.makers.implementation;

import com.amihaescu.abstraction.Coffee;
import com.amihaescu.abstraction.CoffeeType;
import com.amihaescu.abstraction.makers.EspressoMaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LorEspressoMaker implements EspressoMaker {

    private static final Logger LOGGER = LoggerFactory.getLogger(LorEspressoMaker.class);

    @Override
    public Coffee makeCoffee(Integer sugarLevel) {
        LOGGER.info("Making l'or espresso with {} sugar(s)", sugarLevel);
        return new Coffee(CoffeeType.ESPRESSO, sugarLevel);
    }
}
