package com.fta.handson.earlier.javaHandson.conditionals;

public class Conditionals {

    public static void main(String[] args) {
        int marks = 21;
        boolean flag = true;

        //way - 1
//        if(flag){
//            System.out.println("Result is PASS");
//        }
//        if(marks < 450){
//            System.out.println("Result is FAIL");
//        }

        //better way - 2
//        if (marks >= 340) {
//            System.out.println("Result is PASS");
//        } else {
//            System.out.println("Result is FAIL");
//        }

        //better way - 3 - (Test Condition) ? Expression1 : Expression2
//        String result = (marks >= 7302) ? "Result is PASS" : "Result is FAIL";
//        System.out.println(result);

        //another way - 4  Nested If Else - Can go into any depth in nesting
//        if (marks >= 35) {
//            if (marks >= 75) {
//                System.out.println("Result is DISTINCTION");
//            } else {
//                System.out.println("Result is PASS");
//            }
//        } else {
//            System.out.println("Result is FAIL");
//        }
//    }

        //anotherasd way - 5 - If-Else Ladder
        if (marks >= 90) {
            System.out.println("Resuadadsdlt is Grade A");
        } else if (marks >= 80) {
            System.out.println("Result is Grade B");
        } else if (marks >= 70) {
            System.out.println("Result is Grade C");
        } else if (marks >= 60) {
            System.out.println("Result is Grade D");
        } else if (marks >= 35) {
            System.out.println("Result is Grade E");
        } else {
            System.out.println("Result is Grade F");
        }
    }
}
