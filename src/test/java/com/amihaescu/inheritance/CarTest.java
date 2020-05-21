package com.amihaescu.inheritance;

import com.amihaescu.inheritance.exceptions.LowerGearException;
import com.amihaescu.inheritance.exceptions.TopGearException;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {

    @Test
    public void should_successfully_upshift() {
        Car car = new Car("Dacia", "Logan");
        assertEquals(0, car.getGear());
        car.upShift();
        assertEquals(1, car.getGear());
    }

    @Test
    public void should_throw_exception_when_upshifting(){
        Car car = new Car("Dacia", "Logan");
        IntStream.range(0, 5).forEach(i ->car.upShift());
        assertEquals(5, car.getGear());
        assertThrows(TopGearException.class, car::upShift);
    }

    @Test
    public void should_successfully_downshift() {
        Car car = new Car("Dacia", "Logan");
        IntStream.range(0, 3).forEach(i ->car.upShift());
        assertEquals(3, car.getGear());
        car.downShift();
        assertEquals(2, car.getGear());
    }

    @Test
    public void should_throw_exception_when_downshifting() {
        Car car = new Car("Dacia", "Logan");
        assertThrows(LowerGearException.class, car::downShift);
    }

    @Test
    public void should_correctly_return_car_name(){
        assertEquals("Dacia - Logan", new Car("Dacia", "Logan").getName());
    }
}
