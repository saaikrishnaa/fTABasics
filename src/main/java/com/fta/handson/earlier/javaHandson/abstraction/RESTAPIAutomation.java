package com.fta.handson.earlier.javaHandson.abstraction;

public class RESTAPIAutomation extends Automation{

    @Override
    public String automate() {
        return "API Automation commonly includes using the below technologies" +
                " - Postman" +
                " - SOAP UI"+
                " - Rest Assured"+
                " - Third Party Libraries - Apache Commons API, Google API, Faker API, etc"+
                " - TestNG" +
                " - Maven" +
                " - Git" +
                " - Application Server or Cloud Platform";
    }

    @Override
    public void getProjectDetails() {
        System.out.println("Web automation project details");
    }
}
