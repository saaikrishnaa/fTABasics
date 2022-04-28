package com.fta.handson.java.abstraction;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface AutomationInterface {

//    To demonstrate - Interface do not have constructors
//    public AutomationInterface() {
//    }

    //To demonstrate that interface methods cannot be static - until Java 1.7
//    public static String someMethod();

//    public AutomationInterface(String clientName, String projectName, Boolean isAutomationFeasible, String[] technologiesUsed, Boolean isCTEnabled) {
//        this.clientName = clientName;
//        this.projectName = projectName;
//        this.isAutomationFeasible = isAutomationFeasible;
//        this.technologiesUsed = technologiesUsed;
//        this.isCTEnabled = isCTEnabled;
//    }

//    Actual Method
//    public String automate(){
//        return "Automation{" +
//                "clientName='" + clientName + '\'' +
//                ", projectName='" + projectName + '\'' +
//                ", isAutomationFeasible=" + isAutomationFeasible +
//                ", technologiesUsed=" + Arrays.toString(technologiesUsed) +
//                ", isCTEnabled=" + isCTEnabled +
//                '}';
//    }

//    public void getClientDetails(){
//        System.out.println("This"+ getClientName()+"is a insurance client's internal project");
//    }
//    public void getProjectDetails(){
//        System.out.println("This"+getProjectName()+"is a agile project with 40 sprints, each sprint having 2 weeks of duration");
//    }

    //Converting the method into Abstract
    public abstract String automate();

    public abstract void getClientDetails();
    public abstract void getProjectDetails();

    public Set<Integer> rectifyMultipleInheritance(List<String> strings, Map<String, Object> map);

    public void getInformation();


}
