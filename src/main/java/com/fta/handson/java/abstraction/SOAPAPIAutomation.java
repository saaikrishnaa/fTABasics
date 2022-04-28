package com.fta.handson.java.abstraction;

public class SOAPAPIAutomation extends Automation{

    @Override
    public String automate() {
        return "SOAP API Automation technologies";
    }

    @Override
    public void getProjectDetails() {
        System.out.println("This is an internal SOAP API automation project");
    }
}
