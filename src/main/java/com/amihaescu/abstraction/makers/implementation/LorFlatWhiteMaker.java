package com.amihaescu.abstraction.makers.implementation;

import com.amihaescu.abstraction.Coffee;
import com.amihaescu.abstraction.CoffeeType;
import com.amihaescu.abstraction.makers.FlatWhiteMaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LorFlatWhiteMaker implements FlatWhiteMaker {

    private static final Logger LOGGER = LoggerFactory.getLogger(LorFlatWhiteMaker.class);

    @Override
    public Coffee makeCoffee(Integer sugar) {
        LOGGER.info("Making L'or flat white with {} sugar(s)", sugar);
        return new Coffee(CoffeeType.FLAT_WHITE, sugar);
    }
}
