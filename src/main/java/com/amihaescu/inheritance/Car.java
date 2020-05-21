package com.amihaescu.inheritance;

import com.amihaescu.inheritance.exceptions.LowerGearException;
import com.amihaescu.inheritance.exceptions.TopGearException;

public class Car {

    private final String make;
    private final String model;
    private int gear;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getName() {
      return String.format("%s - %s", make, model);
    }
    public void upShift() {
        if (gear < 5) {
          gear++;
        } else {
          throw new TopGearException("Top gear reached");
        }
    }

    public void downShift() {
      if (gear > 1) {
        gear--;
      } else {
        throw new LowerGearException("Lowest gear reached");
      }
    }

    public int getGear() {
      return  gear;
    }
}
