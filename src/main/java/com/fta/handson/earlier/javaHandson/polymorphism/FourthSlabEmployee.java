package com.fta.handson.earlier.javaHandson.polymorphism;

public class FourthSlabEmployee extends Employee{

    public static String value = "FourthSlabEmployee - Child";

    public String getValue() {
        return value;
    }

    public double taxCalculation(int salary){
        return salary * 0.3;
    }


}
