package com.itacademy.java.oop.basics;

public class Employee {
    private String name;
    private String surname;
    private Contract contract;
    private String contract_start_date;
    private int salary;
    private String position;

    public Employee() {
    }

    public Employee(String name, String surname, Contract contract, String contract_start_date, int salary, String position) {
        this.name = name;
        this.surname = surname;
        this.contract = contract;
        this.contract_start_date = contract_start_date;
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contract=" + contract +
                ", contract_start_date='" + contract_start_date + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
