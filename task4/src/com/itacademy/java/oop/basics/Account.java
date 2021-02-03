package com.itacademy.java.oop.basics;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.balance = amount;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded.");
        }
        return balance;
    }

    int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);

        } else {
            System.out.println("Amount exceeded.");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }
}
