package com.tarasenko.quiz;

public class Square implements Shape {
    int side;
    Colour colour;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double size() {
        double area = Math.pow(side, 2);
        return area;
    }

    @Override
    public double colour() {
        double costForColour = size() * colour.cost;
        return costForColour;
    }
}