package com.fta.handson.earlier.javaHandson.inheritance;

public class TypeCastingExample {

    public static void main(String[] args) {
        StudentType parentClassReference = new MCAStudent();
        MCAStudent childClassReference = (MCAStudent) parentClassReference;
        childClassReference.getComputerLabDetails();



    }
}
