package com.fta.handson.earlier.javaHandson.runner;

import com.fta.handson.earlier.javaHandson.staticentity.MethodHidingChild;
import com.fta.handson.earlier.javaHandson.staticentity.MethodHidingParent;

public class PolymorphismRunner{

    public static void main(String[] args) {



        //Method Overloading
//        Calculator calculator = new Calculator();
//
//        System.out.println(calculator.add(2, 4));
//        System.out.println(calculator.add(2, 4, 5));
//        System.out.println(calculator.add(2, 4.5f));
//        System.out.println(calculator.add(2, 4.3f, 12.12123));
//        System.out.println(calculator.add(2.23f, 4, 114.3434534));
//
//        System.out.println("calculator.subtract(4,2) = " + calculator.subtract(4, 2));
//        System.out.println("calculator.subtract(5,1.2f,2.35) = " + calculator.subtract(5, 1.2f, 2.35));

        System.out.println("=================================");

//        //Method Overriding
//        Employee employee = new Employee();
//        System.out.println(employee.taxCalculation(100));
////        System.out.println(employee.getValue());
//        System.out.println(Employee.value);
//
//        Employee firstSlabEmployee = new FirstSlabEmployee();
//        System.out.println(firstSlabEmployee.taxCalculation(100));
////        System.out.println(firstSlabEmployee.getValue());
//        System.out.println(FirstSlabEmployee.value);
//
//        Employee secondSlabEmployee = new SecondSlabEmployee();
//        System.out.println(secondSlabEmployee.taxCalculation(100));
////        System.out.println(secondSlabEmployee.getValue());
//        System.out.println(SecondSlabEmployee.value);
//
//        Employee thirdSlabEmployee = new ThirdSlabEmployee();
//        System.out.println(thirdSlabEmployee.taxCalculation(100));
////        System.out.println(thirdSlabEmployee.getValue());
//        System.out.println(ThirdSlabEmployee.value);
//
//        Employee fourthSlabEmployee = new FourthSlabEmployee();
//        System.out.println(fourthSlabEmployee.taxCalculation(100));
////        System.out.println(fourthSlabEmployee.getValue());
//        System.out.println(FourthSlabEmployee.value);

        System.out.println("============================================================================");

        //Method Hiding
        MethodHidingParent methodHidingParent = new MethodHidingParent();
        methodHidingParent.methodHiding();

        MethodHidingChild methodHidingChild = new MethodHidingChild();
        methodHidingChild.methodHiding();

        MethodHidingParent methodHidingParent1 = new MethodHidingChild();
        methodHidingParent1.methodHiding();

    }
}
