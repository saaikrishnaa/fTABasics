package com.fta.handson.java.abstraction;

public interface AWSCloudProvider extends MultiCloudEnvironment {

    String[] getAWSServicesList();
    public void sample();
    public void avoidMultipleInheritance();

}
