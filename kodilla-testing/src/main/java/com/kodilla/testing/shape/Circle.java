package com.kodilla.testing.shape;

public class Circle implements Shape{
    private double r;
    private final double PI = 3.16;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return PI*(r*r);
    }
}
