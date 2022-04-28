package com.fta.handson.earlier.javaHandson.inheritance;

public class MBAStudent extends StudentType {

    private String semesterName;

    public MBAStudent(int id, String name, String department, String examDate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.examDate = examDate;
    }

    public MBAStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getMBACourseDetails() {
        System.out.println("MBA course is of four semesters with three being the class room, and one being the case study analysis");
    }
}
