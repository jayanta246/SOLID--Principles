package org.jayanta.solid;

import java.util.List;

public class AreaCalculator {

    public double sum(List<Shape> shapes){
        int sum = 0;
        for (int i=0; i<shapes.size(); i++){
            sum+=shapes.get(i).calculateArea();
        }
        return sum;
    }
}
