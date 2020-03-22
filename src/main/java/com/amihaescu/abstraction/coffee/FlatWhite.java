package com.amihaescu.abstraction.coffee;

public class FlatWhite extends Coffee {

    public FlatWhite(Integer sugarLevel, String brand) {
        super(sugarLevel, brand);
    }

    @Override
    public String getDescription() {
        return "A flat white is a coffee drink consisting of espresso with microfoam (steamed milk with small, fine bubbles and a glossy or velvety consistency). It is comparable to a latte, but smaller in volume and with less microfoam, therefore having a higher proportion of coffee to milk, and milk that is more velvety in consistency – allowing the espresso to dominate the flavour, while being supported by the milk. ";
    }
}
