package com.fta.handson.earlier.javaHandson.inheritance;

public class StudentType {
    public int id;
    public String name;
    public String department;
    public String examDate;


    public StudentType() {
//        System.out.println("JVM is calling me"); //TO DEMONSTRATE THAT DEFAULT CONSTRUCTOR IS IMPLICITLY BEING CALLED
        System.out.println("Student Type Constructor is being invoked");
    }


    public StudentType(int id) {
        System.out.println("The paramterized constructor has been accessed, and the student object is construced, and initialized with id - " + id);
    }

    public StudentType(int id, String studentName) {
        System.out.println("The paramterized constructor has been accessed, and the student object is construced, and initialized with id - " + id + ", and name - " + name);
    }

    public StudentType(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // To demonstrate that as per the business need, I can initialize the object with parameterized constructor
    public StudentType(int id, String name, String department, String currentYearExamDate) {
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

    // To demonstrate, as this method is common to both the sub classes
    public void calculateStudentCourseFee() {
        if(department != null){
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
        else{
            System.out.println("");
        }
    }

    protected void toDemonstrateProtectedModifier(){
        System.out.println("understood protected modifier");
    }
}
