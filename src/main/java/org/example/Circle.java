package org.example;

public class Circle implements Polygon {
    public int sides = 0;
    public float radiusMeasure;

    public Circle(float radiusMeasure) {
        this.radiusMeasure = radiusMeasure;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * (radiusMeasure * radiusMeasure));
    }

    @Override
    public int getSides() {
        return sides;
    }
}
