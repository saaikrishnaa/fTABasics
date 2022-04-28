package com.fta.handson.java.polymorphism;

public class FirstSlabEmployee  extends Employee{

    public static String value = "FirstSlabEmployee - Child";

    public String getValue() {
        return value;
    }

    public double taxCalculation(int salary){
        return salary;
    }




}
