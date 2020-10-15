package com.kodilla.testing.shape;

public class Square implements Shape {
    private double side;

    public Square(double a) {
        side = a;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return side * side;
    }
}
