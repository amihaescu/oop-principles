package com.amihaescu.inheritance;

import com.amihaescu.inheritance.exceptions.TopGearException;

public class SportsCar extends Car {


    public SportsCar(String make, String model) {
        super(make, model);
    }

    public void doubleUpShift(){
        if (super.getGear() < 4) {
            super.upShift();
            super.upShift();
        } else {
            throw new TopGearException("Unable to double shift, top gear reached");
        }
    }
}
