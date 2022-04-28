package com.fta.handson.java.basic;



import java.util.Scanner;

public class TakeInputFromUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();


        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        System.out.println("Addition of two numbers - ");
        add(firstNumber, secondNumber);

        System.out.println("Enter first name");
        String firstName = scanner.next();

        System.out.println("Enter last name");
        String lastName = scanner.next();

        concatNames(firstName, lastName);
    }

    private static void concatNames(String firstName, String lastName) {
        System.out.println("Full Name - "+firstName.concat(" ").concat(lastName));
    }

    private static void add(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }
}
