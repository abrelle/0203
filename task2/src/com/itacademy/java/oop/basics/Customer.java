package com.itacademy.java.oop.basics;

import java.util.Arrays;

public class Customer {
    private String name;
    private String surname;
    private String personalNumber;
    private Loan[] loans;

    public Customer() {
    }

    public Customer(String name, String surname, String personalNumber, Loan[] loans) {
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
        this.loans = loans;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public Loan[] getLoans() {
        return loans;
    }

    public double countLoans() {
        double sum = 0;
        for (Loan l : this.loans) {
            sum += l.getAmount();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personalNumber='" + personalNumber + '\'' +
                ", loans=" + Arrays.toString(loans) +
                '}';
    }

}
