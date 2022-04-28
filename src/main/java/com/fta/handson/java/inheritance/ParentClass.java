package com.fta.handson.java.inheritance;

public class ParentClass extends GrandParentClass{

    int id;
    String name;
    String location;

    String value = "Parent class value";

    public String getValue() {
        return value;
    }

    public ParentClass() {
    }

    public ParentClass(int id) {
        this.id = id;
    }

    public ParentClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ParentClass(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public ParentClass(int id, String name, String location, String value) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.value = value;
    }
}
