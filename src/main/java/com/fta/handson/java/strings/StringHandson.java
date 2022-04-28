package com.fta.handson.java.strings;

public class StringHandson {

    public static void main(String[] args) {
        String firstString = "adadaasssssssssssssssss";
        String secondString = "Hi are everyone Hi good";

        //Concatenation
//        System.out.println("Concatenating strings - "+secondString+" "+firstString);
        System.out.println(firstString.concat(" ").concat(secondString));

        //Comparison
        System.out.println("Compare result - "+firstString.equalsIgnoreCase(secondString));

        System.out.println("Length - "+firstString.length());
//
        System.out.println(firstString.substring(3));
//
        System.out.println(secondString.contains(firstString));
//
        System.out.println(firstString.toUpperCase());
//
//        //To demonstrate final variable
        firstString = "Assigning another value to a final variable is restricted";
        System.out.println(firstString);
//
        System.out.println(secondString.replace("are","ARE"));
//
        System.out.println(secondString.charAt(4));
//
        System.out.println(secondString.startsWith("Hi"));
//
        System.out.println(secondString.replace("Hi","Hello"));

    }
}
