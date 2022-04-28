package com.fta.handson.java.polymorphism;

public class ThirdSlabEmployee extends Employee{

    public static String value = "ThirdSlabEmployee - Child";

    public String getValue() {
        return value;
    }

    public double taxCalculation(int salary){
        return salary*0.2;
    }


}
