package org.example;

public class App
{
    public static void main( String[] args ) {
        Polygon square, circle, rectangle;

        square = new Square(5);
        circle = new Circle(3);
        rectangle = new Rectangle(4,5);

        System.out.println("S Q U A R E");
        System.out.println("Square sides: " + square.getSides());
        System.out.println("Square area: " + square.getArea());

        System.out.println("C I R C L E");
        System.out.println("Square sides: " + circle.getSides());
        System.out.println("Square area: " + circle.getArea());

        System.out.println("R E C T A N G L E");
        System.out.println("Square sides: " + rectangle.getSides());
        System.out.println("Square area: " + rectangle.getArea());
    }
}
