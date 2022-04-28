package com.fta.handson.earlier.javaHandson.abstraction;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class BigDataAutomation implements AutomationInterface {
    @Override
    public String automate() {
        return "Big Data Automation commonly includes using the below technologies" +
                " - Hadoop" +
                " - or Spark" +
                " - Pig" +
                " - Hive" +
                " - HBase";
    }

    @Override
    public void getClientDetails() {
        System.out.println("Client details for Big Data project");
    }

    @Override
    public void getProjectDetails() {
        System.out.println("Project details for Big Data project");
    }

    @Override
    public Set<Integer> rectifyMultipleInheritance(List<String> strings, Map<String, Object> map) {
        return null;
    }

    public void getInformation(){}

}
