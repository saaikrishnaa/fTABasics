package com.fta.handson.earlier.javaHandson.methods;

public class BasicMethod {

    public static void main(String[] args) {

        //Why I need a method?
        int value1 = 10;
        int value2 = 20;
//        System.out.println(value1+value2);

//        addTwoNumbers(value1,value2);


        int result = addTwoNumbersAndReturnResult(value1, value2);
        System.out.println(result);



        int value3 = 30;
        int value4 = 40;
//        System.out.println(value3+value4);

//        addTwoNumbers(value3, value4);
    }

    //A method that do not return anything
    static void addTwoNumbers(int firstParameter, int secondParameter) {
        System.out.println(firstParameter+secondParameter);
    }

    //A method that returns a value
    static int addTwoNumbersAndReturnResult(int first, int second){
        int result = first + second;
        return result;
    }

    //private method
    private void privateMethod(){
        System.out.println("I am a private method, and I cannot be accessed from outside of the class");
    }

    //public method
    public void publicMethod(){
        System.out.println("I am a public method,  I can be accessed from within the class, outside the class, within the package and outside the package");
    }

    //default method
    void defaultMethod(){
        System.out.println("My access level is only within the package. I cannot be accessed from outside the package");
    }
}
