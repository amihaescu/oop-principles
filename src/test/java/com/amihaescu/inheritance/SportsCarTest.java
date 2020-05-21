package com.amihaescu.inheritance;

import com.amihaescu.inheritance.exceptions.TopGearException;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SportsCarTest {

    @Test
    void should_double_shift() {
        SportsCar sportsCar = new SportsCar("Porsche", "911");

        sportsCar.doubleUpShift();

        assertEquals(2, sportsCar.getGear());
    }

    @Test
    void should_throw_exception_when_trying_to_double_shift() {
        SportsCar sportsCar = new SportsCar("Porsche", "911");
        IntStream.range(0, 4).forEach(i -> sportsCar.upShift());
        assertEquals(4, sportsCar.getGear());
        assertThrows(TopGearException.class, sportsCar::doubleUpShift);
    }
}
