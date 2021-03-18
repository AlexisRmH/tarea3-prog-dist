package org.example;

public class Square implements Polygon{
    public int sides = 4;
    public float sideMeasures;

    public Square(float sideMeasures) {
        this.sideMeasures= sideMeasures;
    }

    @Override
    public float getArea() {
        return sideMeasures * sideMeasures;
    }

    @Override
    public int getSides() {
        return sides;
    }
}