package com.fta.handson.java.runner;

import com.fta.handson.java.inheritance.ChildClass;
import com.fta.handson.java.inheritance.StudentType;

public class InheritanceRunner extends StudentType {

    public static void main(String[] args) {
//
//        MCAStudent student1 = new MCAStudent(101, "student1", "computers", "04-05-2022");
//        student1.calculateStudentCourseFee();
//        student1.getComputerLabDetails();
//
//        System.out.println("============================");
//
//        MBAStudent student2 = new MBAStudent(101, "student1", "business", "04-05-2022");
//        student2.calculateStudentCourseFee();
//        student2.getMBACourseDetails();
//
//        System.out.println("============================");
//
//
//        MAStudent student3 = new MAStudent(101, "student1", "mathematics");
//        student3.calculateStudentCourseFee();
//        student3.getMathsTestDetails();

//        System.out.println("============================");

//        MCAStudent mcaStudent = new MCAStudent();

        System.out.println("============================");
        ChildClass child = new ChildClass();
        System.out.println("child.getValue() = " + child.getValue());
        child.display();

    }
}
