package com.fta.handson.java.staticentity;

public class MethodHidingChild extends MethodHidingParent{

    public static void methodHiding(){
        System.out.println("Child implementation is invoked");
    }
}
