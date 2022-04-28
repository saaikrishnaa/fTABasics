package com.fta.handson.java.staticentity;

public class UnderstandMethodOverloading {

    private static String id;
    private static String name;
    private static String department;

    public static Integer calculateStudentCourseFee(String id, String department) {
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

//        Demonstrate this cannot be used in static context
//        int id = this.id;

        return courseFee;
    }

    public static void getStudentDetails(String studentId, String studentName, String studentDepartment){
        System.out.println(studentId+", "+studentName+", "+studentDepartment);

        //Another scenario of method overloading
//        String result = getStudentDetails(studentName,studentDepartment);
//        System.out.println(result);
    }


    // To demonstrate that Method Overloading is not possible just by changing the return type of the method
//    public static Integer getStudentDetails(String studentId, String studentName, String studentDepartment){
//        System.out.println(studentId+", "+studentName+", "+studentDepartment);
//        return 1;
//    }

    public static String getStudentDetails(String studentName, String studentDepartment){
        String studentDetails = "";
        studentDetails = studentName.concat(",").concat(studentDepartment);
        return studentDetails;
    }
}
