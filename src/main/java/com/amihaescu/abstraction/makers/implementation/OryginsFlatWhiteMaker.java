package com.amihaescu.abstraction.makers.implementation;

import com.amihaescu.abstraction.Coffee;
import com.amihaescu.abstraction.CoffeeType;
import com.amihaescu.abstraction.makers.FlatWhiteMaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OryginsFlatWhiteMaker implements FlatWhiteMaker {

    private static final Logger LOGGER = LoggerFactory.getLogger(OryginsFlatWhiteMaker.class);

    @Override
    public Coffee makeCoffee(Integer sugar) {
        LOGGER.info("Making orygins flat white with {} sugar(s)", sugar);
        return new Coffee(CoffeeType.FLAT_WHITE, sugar);
    }
}
