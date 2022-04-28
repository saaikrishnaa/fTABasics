package com.fta.handson.java.javaPrograms;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println("Enter a string");
        Scanner scanner = new Scanner(System.in);
        String givenString = scanner.nextLine();

        //miscellaneous
        for(int i= givenString.length()-1; i>=0; i--){
            System.out.println();
        }

//        List<Integer> strings = new ArrayList<>();
//        Integer first = new Integer(10);
//        String second = "Hi";
//        Employee employee = new Employee();
//        strings.add(first);
//        strings.add(second);
//        strings.add(employee);


    }
}
