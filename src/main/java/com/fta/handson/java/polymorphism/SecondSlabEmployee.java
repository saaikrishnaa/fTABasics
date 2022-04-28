package com.fta.handson.java.polymorphism;

public class SecondSlabEmployee extends Employee{

    public static String value = "SecondSlabEmployee - Child";

    public String getValue() {
        return value;
    }

    public double taxCalculation(int salary) {
        return salary*0.1;
    }


//    We cannot override a final method
    public String finalMethod(){
        return "Hey, I have overridden the parent class method..., wait..! Did I?";
    }


}
