package com.fta.handson.java.runner;

import com.fta.handson.java.pojo.Employee;

public class ClassObjectRunner {

    public static void main(String[] args) {

       Employee samuel = new Employee(); //23525243523

        samuel.setId(101);
        samuel.setName("Samuel");
        samuel.setSalary(34000.00);
        samuel.setContractEmployee(false);
        samuel.setDesignation("QA Engineer");
        samuel.setWorkLocation("New Jersey");

        Employee roger = new Employee();
        roger.setId(201);
        roger.setName("Roger");
        roger.setSalary(244000.00);
        roger.setContractEmployee(true);
        roger.setDesignation("QA Lead");
        roger.setWorkLocation("Texas");



        Employee dravid = new Employee();
        System.out.println(dravid);




    }
}
