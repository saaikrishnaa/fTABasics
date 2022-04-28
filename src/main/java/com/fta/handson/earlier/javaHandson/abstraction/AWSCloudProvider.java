package com.fta.handson.earlier.javaHandson.abstraction;

public interface AWSCloudProvider extends MultiCloudEnvironment {

    String[] getAWSServicesList();
    public void sample();
    public void avoidMultipleInheritance();

}
