package com.tarasenko.quiz;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Shape first = new Square(5);
        Shape second = new Square(10);
        Shape third = new Circle(5);
        Shape forth = new Circle(10);
//        List<Shape> shapes = new ArrayList<>();
//        shapes.add(first);
//        shapes.add(second);
//        shapes.add(third);
//        shapes.add(forth);

//        System.out.println(Main.calculateCost(shapes, Colour.RED));
    }

    private static double calculateCost(List<Shape> shapes, Colour filterColour) {
        double costing = shapes.size() * filterColour.cost;
        return costing;
    }

    private Shape findMostExpensive(List<Shape> shapes) {
        return null;
    }
}