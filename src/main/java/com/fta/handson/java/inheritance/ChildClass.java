package com.fta.handson.java.inheritance;

public class ChildClass extends ParentClass{

    int id;
    String name;
    String location;

    String value = "Child class value";

    public String getValue() {
        return value;
    }

    public void display(){
        System.out.println(value);
        System.out.println(this.value);
        System.out.println(super.value);

    }


    public ChildClass() {
        super(10);
//        this(10,"name");
    }

    public ChildClass(int id) {
        this();
        this.id = id;
    }

    public ChildClass(int id, String name) {
        super(id,name);
//        this.id = id;
//        this.name = name;
    }

    public ChildClass(int id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }


}
