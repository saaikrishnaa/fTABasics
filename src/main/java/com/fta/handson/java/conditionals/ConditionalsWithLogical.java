package com.fta.handson.java.conditionals;

public class ConditionalsWithLogical {

    public static void main(String[] args) {
        int marks = 73;
        boolean isDistinction = false;

       if(marks >= 0 && marks <= 35){
           System.out.println("Result is FAIL");
       }

       if(marks > 35 || marks < 75){
           System.out.println("Result is PASS");
       }

       if(!isDistinction){
           System.out.println("Result is DISTINCTION");
       }
    }
}
