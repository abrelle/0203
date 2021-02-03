package com.itacademy.java.oop.basics;

public enum Contract {
    FULL_TIME("Full-time"), PART_TIME("Part-time");
    private String contract;

    Contract(String type) {
        this.contract = type;
    }
}
