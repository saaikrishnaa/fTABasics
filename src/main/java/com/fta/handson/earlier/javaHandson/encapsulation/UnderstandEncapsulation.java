package com.fta.handson.earlier.javaHandson.encapsulation;

public class UnderstandEncapsulation {
    private static Integer id;
    private static String name;

    public UnderstandEncapsulation() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        if (id == null || id > 0) {
            // This have to a log statement in real-time
            if (id == null) {
                System.out.println("As the id is assigned a null value, re-assigning the id to a default value to avoid Null Pointer Exception");
                this.id = 50000; // this is the default value
            } else {
                this.id = id;
            }
        } else if (id <= 0) {
            // Have some random number generation logic here
            this.id = 52352;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayValues() {
        System.out.println("The values are - id -> " + id + ", and name -> " + name);
    }
}
