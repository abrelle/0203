package com.itacademy.java.oop.basics;

public class Loan {
    private String id;
    private double amount;
    private LoanType type;

    public Loan() {
    }

    public Loan(String id, double amount, LoanType type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public LoanType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", type=" + type +
                '}';
    }
}
