package com.itacademy.java.oop.basics;

public enum LoanType {

    LEASING("leasing"), CONSUMER("consumer");
    private String typeValue;

    LoanType(String type) {
        this.typeValue = type;
    }
}
