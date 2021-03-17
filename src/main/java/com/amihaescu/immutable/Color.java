package com.amihaescu.immutable;

public final class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public Color setRed(int newRed) {
        return new Color(newRed, this.green, this.blue);
    }

    public Color setGreen(int newGreen) {
        return new Color(this.red, newGreen, this.blue);
    }

    public Color setBlue(int newBlue) {
        return new Color(this.red, this.green, newBlue);
    }
}
