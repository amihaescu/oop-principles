package com.amihaescu.encapsulation.immutable;

public final class Color {

    private final Integer red;
    private final Integer blue;
    private final Integer green;

    public Color(Integer red, Integer blue, Integer green) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    public Integer getRed() {
        return red;
    }

    public Integer getBlue() {
        return blue;
    }

    public Integer getGreen() {
        return green;
    }

    public Color setRed(Integer newRed) {
        return new Color(newRed, this.blue, this.green);
    }

    public Color setBlue(Integer newBlue) {
        return new Color(this.red, newBlue, this.green);
    }

    public Color setGreen(Integer newGreen) {
        return new Color(this.red, this.blue, newGreen);
    }
}
