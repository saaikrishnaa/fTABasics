package com.fta.handson.earlier.javaHandson.abstraction;

public abstract class Automation {

    private String clientName;
    private String projectName;
    private Boolean isAutomationFeasible;
    private String[] technologiesUsed;
    private Boolean isCTEnabled;

    public Automation() {
    }

    public Automation(String clientName, String projectName, Boolean isAutomationFeasible, String[] technologiesUsed, Boolean isCTEnabled) {
        this.clientName = clientName;
        this.projectName = projectName;
        this.isAutomationFeasible = isAutomationFeasible;
        this.technologiesUsed = technologiesUsed;
        this.isCTEnabled = isCTEnabled;
    }

    //Actual Method
//    public String automate(){
//        return "Automation{" +
//                "clientName='" + clientName + '\'' +
//                ", projectName='" + projectName + '\'' +
//                ", isAutomationFeasible=" + isAutomationFeasible +
//                ", technologiesUsed=" + Arrays.toString(technologiesUsed) +
//                ", isCTEnabled=" + isCTEnabled +
//                '}';
//    }

    public void getClientDetails(){
        System.out.println("This client is a insurance client's internal project");
    }
//    public void getProjectDetails(){
//        System.out.println("This project is a agile project with 40 sprints, each sprint having 2 weeks of duration");
//    }

    public void getCICDDetails(){
        System.out.println("I am a non abstract method, in the abstract class");
        System.out.println("As I know the implementation for this method, I am implemeting here");
    }
    //Converting the method into Abstract
    public abstract String automate();


//    public abstract void getClientDetails();
    public abstract void getProjectDetails();


}
