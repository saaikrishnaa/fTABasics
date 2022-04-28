package com.fta.handson.java.pojo;

import java.util.Arrays;

public class College {

    private int id;
    private String name;
    private String[] courses;
    private boolean isRegistered;
    private double yearlyGrowth;

    public College(){

    }

    public College(int id) {
        this.id = id;
    }

    public College(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public College(int id, String name, boolean isRegistered) {
        this.id = id;
        this.name = name;
        this.isRegistered = isRegistered;
    }

    public College(int id, String name, String[] courses, boolean isRegistered, double yearlyGrowth) {
        this.id = id;
        this.name = name;
        this.courses = courses;
        this.isRegistered = isRegistered;
        this.yearlyGrowth = yearlyGrowth;
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

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public double getYearlyGrowth() {
        return yearlyGrowth;
    }

    public void setYearlyGrowth(double yearlyGrowth) {
        this.yearlyGrowth = yearlyGrowth;
    }

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", isRegistered=" + isRegistered +
                ", yearlyGrowth=" + yearlyGrowth +
                '}';
    }
}
