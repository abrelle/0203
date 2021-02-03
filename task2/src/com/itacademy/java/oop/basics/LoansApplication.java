package com.itacademy.java.oop.basics;

public class LoansApplication {
    public static void main(String[] args) {

        Loan firstLoan = new Loan("#757", 30000, LoanType.CONSUMER);
        Loan secondLoan = new Loan("#332", 23455, LoanType.LEASING);
        Loan[] loans = {firstLoan, secondLoan};
        Customer peter = new Customer("peter", "grey", "86666666", loans);
        printAllInfo(peter);
    }

    public static void printAllInfo(Customer customer) {
        System.out.println(customer);
        System.out.println("Total amount of loans is " + customer.countLoans());
    }
}
