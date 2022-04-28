package com.fta.handson.earlier.javaHandson.pojo;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private String designation;
    private boolean isContractEmployee;
    private String workLocation;
    private String department;

    public Employee(){
        System.out.println("JVM is calling me");
    }

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
