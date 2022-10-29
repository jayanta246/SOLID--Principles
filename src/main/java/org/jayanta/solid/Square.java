package org.jayanta.solid;

public class Square implements Shape, ThreeDimensionalShape{
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return Math.pow(getLength(), 2);
    }


    @Override
    public double calculateVolume() {
        return Math.pow(getLength(), 3);
    }
}
