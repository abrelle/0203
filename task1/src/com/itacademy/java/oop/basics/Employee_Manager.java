package com.itacademy.java.oop.basics;

public class Employee_Manager {
    public static void main(String[] args) {

        Employee john = new Employee("John", "Wick", Contract.FULL_TIME, "2020-03-11", 2000, "model");
        System.out.println(john.toString());
    }
}
