package com.tarasenko.quiz;

public enum Colour {
    RED(100),
    GREEN(150),
    BLUE(200);

    public int cost;

    Colour(int cost) {
        this.cost = cost;
    }
}