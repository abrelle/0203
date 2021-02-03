package com.itacademy.java.oop.basics;

public class ShapeApplication {
    public static void main(String[] args) {
        Square squareSmall = new Square(2.33, 4.55);
        Square squareMedium = new Square(21.01, 78.345);
        Square squareLarge = new Square(666.666, 999.999);
        Square squareBad = new Square(-2.3, 4.2);

        Square[] arrayOfSquares = {squareSmall, squareBad, squareLarge, squareMedium};

        for (Square square : arrayOfSquares) {
            if (isShapeValid(square)) {
                System.out.println("Square is valid.");
                System.out.println(square);
                System.out.println("Area is " + square.getArea() + " and perimeter is " + square.getPerimeter());
            } else {
                System.out.println("Square is not valid.");
                System.out.println(square);
            }
        }

    }

    public static boolean isShapeValid(Square square) {
        if (square.getLength() <= 0 || square.getWidth() <= 0) {
            return false;
        }
        return true;
    }


}
