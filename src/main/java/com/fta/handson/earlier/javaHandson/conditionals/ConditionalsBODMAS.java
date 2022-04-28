package com.fta.handson.earlier.javaHandson.conditionals;

public class ConditionalsBODMAS {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        int result = 10+a*b-c;

        if (a == 1) {
            System.out.println("There can be multiple statements in a block - " + (b + c));
            System.out.println(b + c);
        } else if (a > 1) {
            System.out.println("Now a is > 1");
            System.out.println(c - b);
        }

//        System.out.println(result);


    }
}
