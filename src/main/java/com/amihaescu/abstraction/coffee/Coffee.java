package com.amihaescu.abstraction.coffee;

public abstract class Coffee {

    private Integer sugarLevel;
    private String brand;

    public Coffee(Integer sugarLevel, String brand) {
        this.sugarLevel = sugarLevel;
        this.brand = brand;
    }


    public Integer getSugarLevel() {
        return sugarLevel;
    }

    public String getBrand() {
        return brand;
    }
}
