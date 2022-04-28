package com.fta.handson.java.encapsulation;

public class ReadOnlyEncapsulatedEntity {

    private String college = "College Name";
    private String university = "University Name";

    public String getCollege() {
        return college;
    }

    public String getUniversity() {
        return university;
    }

    public void displayValues(){
        System.out.println("The values are - College -> "+getCollege()+", and University -> "+getUniversity());
    }
}
