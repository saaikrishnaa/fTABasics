package com.fta.handson.earlier.javaHandson.inheritance;

public class MCAClassStudent {

    int id;
    String name;
    String department;
    String examDate;

    public MCAClassStudent() {
        System.out.println("JVM is calling me");
    }

    public MCAClassStudent(int id) {
        System.out.println("The paramterized constructor has been accessed, and the student object is construced, and initialized with id - " + id);
    }

    public MCAClassStudent(int id, String studentName) {
        System.out.println("The paramterized constructor has been accessed, and the student object is construced, and initialized with id - " + id + ", and name - " + name);
    }

    public MCAClassStudent(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // To demonstrate that as per the business need, I can initialize the object with parameterized constructor
    public MCAClassStudent(int id, String name, String department, String currentYearExamDate) {
        this.id = id;
        this.name = name;
        this.department = department;
        examDate = currentYearExamDate;
    }

    public void getId() {
        System.out.println(id);
    }

    public void getName() {
        System.out.println(name);
    }

    public void getDepartment() {
        System.out.println(department);
    }

    public void getExamDate() {
        System.out.println("The exam date for the student is -" + examDate);
    }


    // To demonstrate , as this method is common to both the sub classes
    public void calculateStudentCourseFee() {
        // To demonstrate the local variables will not be initialized by constructor
        int courseFee = 0;
        int basicFee = 10000;
        int tutionFee = 4500;
        int convenieneceFee = 2000;
        int computerLabFee = 5000;
        if (department.equalsIgnoreCase("computers")) {
            courseFee = basicFee + tutionFee + convenieneceFee + computerLabFee;
        } else if (department.equalsIgnoreCase("business")) {
            computerLabFee = 0;
            courseFee = basicFee + tutionFee + convenieneceFee + computerLabFee;
        } else {
            computerLabFee = 0;
            convenieneceFee = 0;
            courseFee = basicFee + tutionFee + convenieneceFee + computerLabFee;
        }
        System.out.println("Student with id - " + id + ", has a course fee to pay for amount - " + courseFee);
    }

    // To demonstrate, as this method is specific to one class
    //To demonstrate final
    public void getComputerLabDetails() {
        if (department.equalsIgnoreCase("computers")) {
            System.out.println("Computer lab is open for hands on practice from 17:30 to 19:30 on TUESDAY, THUSDAY and FRIDAY");
        }
    }

    private void businessSpecificMethod() {
        System.out.println("This method cannot be accessed outside of this class");
    }

}
