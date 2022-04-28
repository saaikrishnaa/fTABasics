package com.fta.handson.java.abstraction;

public class MobileAutomation extends Automation{

    @Override
    public String automate() {
        return "Mobile Automation commonly includes using the below technologies" +
                " - Android SDK" +
                " - Appium Desktop/Client"+
                " - Emulator"+
                " - Third Party Libraries - Apache Commons API, Google API, Faker API, etc"+
                " - TestNG" +
                " - Maven" +
                " - Git" +
                " - Sauce Labs or another Cloud Provider";
    }

    @Override
    public void getProjectDetails() {
        System.out.println("Web automation project details");
    }
}
