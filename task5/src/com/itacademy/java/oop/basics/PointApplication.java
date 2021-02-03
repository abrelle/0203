package com.itacademy.java.oop.basics;

public class PointApplication {
    public static void main(String[] args) {
        MyPoint firstPoint = new MyPoint(2, 3);
        MyPoint secondPoint = new MyPoint(4, 7);


        firstPoint.setX(-3);
        firstPoint.setY(-2);
        System.out.print("First point new coordinates are (");
        for (int cord : firstPoint.getXY()) {
            System.out.print(cord + " ");
        }
        System.out.println(")");

        secondPoint.setXY(6, 6);
        int[] newCords = secondPoint.getXY();
        System.out.println("Second point new coordinates are (" + newCords[0] + "," + newCords[1] + ")");

        System.out.println("Distance from first point " + firstPoint.toString() +
                " and point (12, 3) is " + firstPoint.distance(12, 3));
        System.out.println("Distance from first point " + firstPoint.toString() + " and second point" +
                secondPoint.toString() + " is " + firstPoint.distance(secondPoint));

        MyPoint thirdPoint = new MyPoint();

        System.out.println("Distance from first point " + firstPoint.toString() + " and point" +
                thirdPoint.toString() + " is " + firstPoint.distance(thirdPoint));

    }
}
