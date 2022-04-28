package com.fta.handson.earlier.javaHandson.polymorphism;

public class Calculator {

    public int add(int first, int second) {
        return first + second;
    }

    public int add(int first, int second, int third) {
        return first + second + third;
    }

    public float add(int first, float second) {
        return first + second;
    }

    public double add(int first, float second, double third) {
        return first + second + third;
    }

    public double add(float first, int second, double third) {
        return first + second + third;
    }

    public int subtract(int firstParameter, int secondParameter) {
        return firstParameter - secondParameter;
    }

    public float subtract(int firstParameter, float secondParameter) {
        return firstParameter - secondParameter;
    }

    public float subtract(float secondParameter, int firstParameter) {
        return firstParameter - secondParameter;
    }

    public double subtract(int first, float second, double third) {
        return first - second - third;
    }

}
