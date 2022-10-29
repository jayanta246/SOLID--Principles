package org.jayanta.solid;

public class ShapePrinter {

    public String json(int sum){
        return "{ShapesSum: %s}".formatted(sum);
    }
}
