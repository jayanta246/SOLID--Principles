package org.jayanta;

import org.jayanta.solid.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator =new AreaCalculator();
        ShapePrinter shapePrinter = new ShapePrinter();
        Square square = new Square(10);
        Circle circle = new Circle(10);
        List<Shape> shapes = List.of(square, circle);
        int sum = (int) areaCalculator.sum(shapes);
        System.out.println(shapePrinter.json(sum));
    }
}