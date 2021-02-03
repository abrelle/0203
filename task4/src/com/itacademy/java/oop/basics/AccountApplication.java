package com.itacademy.java.oop.basics;

public class AccountApplication {
    public static void main(String[] args) {
        Account steven = new Account("#657", "Steven", 100);
        Account peter = new Account("#658", "Peter", 50);
        steven.credit(10);
        steven.credit(20);
        System.out.println(steven.getName() + "'s new balance is " + steven.getBalance());
        peter.credit(10);
        System.out.println(peter.getName() + "'s new balance is " + peter.getBalance());
        steven.debit(500);
        peter.transferTo(steven, 70);
        steven.debit(30);
        System.out.println(steven.getName() + "'s new balance is " + steven.getBalance());
        steven.transferTo(peter, 10);
        System.out.println(steven.getName() + "'s new balance is " + steven.getBalance());
        System.out.println(peter.getName() + "'s new balance is " + peter.getBalance());
        System.out.println(steven);
        System.out.println(peter);

    }
}
