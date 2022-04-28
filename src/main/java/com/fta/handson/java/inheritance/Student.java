package com.fta.handson.java.inheritance;

public class Student {

    int id;
    String name;
    String department;
    String examDate;

    //To demonstrate this()
    public Student() {
        this(200,"default name","default department");

        // To demonstrate this() should be used only once in a constructor
//        this(344);
    }

    //To demonstrate this()
    Student(int id) {
        this();
        this.id = id;
    }

    public Student(int id, String studentName) {
        this.id = id;
        name = studentName;
    }

    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // To demonstrate that as per the business need, I can initialize the object with parameterized constructor
    public Student(int id, String name, String department, String currentYearExamDate) {
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

    protected void calculateStudentCourseFee() {
        // To demonstrate the local variables will not be initialized by constructor
        int courseFee = 0;
        int basicFee = 10000;
        int tutionFee = 4500;
        int convenieneceFee = 2000;
        int computerLabFee = 5000;
        if (department.equalsIgnoreCase("computers")) {
            courseFee = basicFee + tutionFee + convenieneceFee + computerLabFee;
        } else {
            computerLabFee = 0;
            courseFee = basicFee + tutionFee + convenieneceFee + computerLabFee;
        }
        System.out.println("Student with id - " + id + ", has a course fee to pay for amount - " + courseFee);
    }

      public void getComputerLabDetails(){
        if(department.equalsIgnoreCase("computers")) {
            System.out.println("Computer lab is open for hands on practice from 17:30 to 19:30 on TUESDAY, THUSDAY and FRIDAY");
        }
    }

    public void getMathsTestDetails(){
        System.out.println("Mathematics  exam will be on third week of every month");
    }

    private void businessSpecificMethod(){
        System.out.println("This method cannot be accessed outside of this class");
    }



}
