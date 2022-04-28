package com.fta.handson.java.pojo;

import com.fta.handson.java.inheritance.StudentType;

public class Employees extends StudentType {

    private double salary;
    private String designation;
    private boolean isContractEmployee;
    private String workLocation;

    public Employees(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public boolean isContractEmployee() {
        return isContractEmployee;
    }

    public void setContractEmployee(boolean contractEmployee) {
        isContractEmployee = contractEmployee;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", isContractEmployee=" + isContractEmployee +
                ", workLocation='" + workLocation + '\'' +
                '}';
    }
}
