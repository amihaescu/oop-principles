package com.amihaescu.encapsulation.immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColorTest {


    @Test
    public void from_blue_to_purple() {
        Color blue = new Color(0, 255, 0);
        Color purple = blue.setRed(255);
        assertEquals(255, purple.getBlue());
        assertEquals(255, purple.getRed());
        assertEquals(0, blue.getRed());
        assertEquals(255, blue.getBlue());
    }
}
