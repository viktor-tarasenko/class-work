package com.tarasenko.quiz;

public class Circle implements Shape {
    int diameter;
    Colour colour;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public double size() {
        int radius = diameter / 2;
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public double colour() {
        double costForColour = size() * colour.cost;
        return costForColour;
    }
}
