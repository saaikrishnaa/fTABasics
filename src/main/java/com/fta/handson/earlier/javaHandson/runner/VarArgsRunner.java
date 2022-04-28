package com.fta.handson.earlier.javaHandson.runner;

public class VarArgsRunner {

    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 2323;

//        addTwoNumbers(firstNumber, secondNumber, thirdNumber);

        int[] givenNumbers = new int[5];
        givenNumbers[0] = 232;
        givenNumbers[1] = 222;


//        addTwoNumbersUsingArray(givenNumbers);
//        System.out.println(givenNumbers[10]);

        addNumbersUsingVarArgs(1);
        addNumbersUsingVarArgs(1,232,23);
        addNumbersUsingVarArgs(232,223,343525,3543,3423,1232156,2213,123,232,0,131231,123);

    }

    private static void addNumbersUsingVarArgs(int... numbers) {

        int total = 0;
        for(int i =0; i< numbers.length; i++){
            total += numbers[i];
        }
        System.out.println(total);

    }


    private static void addTwoNumbersUsingArray(int[] givenNumbers) {

        int sum = 0;
        for(int i=0; i< givenNumbers.length; i++){
            sum = sum + givenNumbers[i];
        }
        System.out.println(sum);
    }

    private static void addTwoNumbers(int first, int second, int addedNumber) {
        System.out.println(first + second + addedNumber);
    }

}


