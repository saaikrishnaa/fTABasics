package com.fta.handson.java.arrays;

public class ArraysHandson {
    public static void main(String[] args) {

        //Need of Array
//        int first = 10;
//        int second = 20;
//        int first = 10;
//        int second = 20;
//        int first = 10;
//        int second = 20;
//        int first = 10;
//        int second = 20;
//        int first = 10;
//        int second = 20;
//        int first = 10;
//        int second = 20;
//        int first = 10;
//        int second = 20;

//        int[] integerArray = {11, 9, 17, 89};


//
        int[] givenArray = new int[10];
        givenArray[0] = 324;
        givenArray[3] = 644;

//
//        for(int i=0; i< givenArray.length; i++){
//            System.out.println(givenArray[i]);
//        }

//        int[] anotherArray = {3525,23523,2312,4542,57323,2313,645,223,124,2151};
//        for(int i =0; i<=anotherArray.length-1;i++){
//            System.out.println(anotherArray[i]);
//        }

        //Access an element outside the array's given index range
        System.out.println(givenArray[24]);
    }
}
