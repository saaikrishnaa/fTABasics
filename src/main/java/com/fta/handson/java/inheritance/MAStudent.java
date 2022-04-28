package com.fta.handson.java.inheritance;

public class MAStudent extends StudentType {

    public MAStudent(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void getMathsTestDetails() {
        System.out.println("Mathematics exam will be on third week of every month");
    }
}
