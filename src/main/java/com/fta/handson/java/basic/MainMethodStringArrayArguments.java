package com.fta.handson.java.basic;


public class MainMethodStringArrayArguments {

    public static void main(String[] takeStringArgs) {

        System.out.println("Enter values");

        for (int i = 0; i < takeStringArgs.length; i++) {
            System.out.println(takeStringArgs[i]);
        }
    }
}
