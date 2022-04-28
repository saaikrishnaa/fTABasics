package com.fta.handson.earlier.javaHandson.inheritance;

public class MCAStudent extends PostGraduateStudent {

    private String semesterName;

    public MCAStudent() {
        System.out.println("MCA Student Constructor is being invoked");
    }

    public MCAStudent(int id, String name, String department, String examDate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.examDate = examDate;
    }

    public MCAStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void getComputerLabDetails() {
        System.out.println("Computer lab is open for hands on practice from 17:30 to 19:30 on TUESDAY, THUSDAY and FRIDAY");
    }
}
