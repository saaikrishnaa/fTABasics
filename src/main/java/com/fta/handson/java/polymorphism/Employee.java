package com.fta.handson.java.polymorphism;

public class Employee {

    public static String value = "Employee - Parent";

    public double taxCalculation(int salary) {
        return 0;
    }

    public String getValue() {
        return value;
    }

//    public final String finalMethod() {
//        return "Can I be overridden?";
//    }
}
