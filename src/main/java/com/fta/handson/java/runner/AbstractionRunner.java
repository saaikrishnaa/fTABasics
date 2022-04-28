package com.fta.handson.java.runner;

import com.fta.handson.earlier.javaHandson.abstraction.*;
import com.fta.handson.java.abstraction.*;

import java.util.Arrays;

public class AbstractionRunner {

    public static void main(String[] args) {
        System.out.println("============================================================================");
//        String[] technologiesUsed = {"Selenium","Cucumber","TestNG","Maven","Jenkins","Google Cloud Platform","Jenkins","Git"};
//        Automation automation = new Automation("Insurance Client","Project1", true,technologiesUsed, true);
//        System.out.println(automation.automate());

        //Way 1
//        Automation automation = new Automation() {
//            @Override
//            public String automate() {
//                return "I am automating";
//            }
//        };
//        System.out.println(automation.automate());

        //Way 2
        Automation webAutomation = new WebAutomation();
        System.out.println(webAutomation.automate());
        webAutomation.getProjectDetails();
        webAutomation.getCICDDetails();

        Automation mobileAutomation = new MobileAutomation();
        System.out.println(mobileAutomation.automate());
        mobileAutomation.getProjectDetails();

        Automation restapiAutomation = new RESTAPIAutomation();
        String value = restapiAutomation.automate();
        System.out.println(value);
        restapiAutomation.getProjectDetails();

        System.out.println("============================================================================");
        AutomationInterface automationInterface = new BigDataAutomation();
        automationInterface.getClientDetails();
        automationInterface.getProjectDetails();

        AutomationInterface bigDataAWSAutomation = new BigDataAWSAutomation();
        bigDataAWSAutomation.getInformation();

        System.out.println("============================================================================");
        COEAutomation coeAutomation = new COEAutomation();

        String automationDetails = coeAutomation.automate();
        System.out.println(automationDetails);

        String[] awsServicesList = coeAutomation.getAWSServicesList();
        System.out.println(Arrays.asList(awsServicesList));

        coeAutomation.getBillingDetails();
        coeAutomation.getCloudProviderDetails();
        coeAutomation.getProjectDetails();

        String[] gcpServices = coeAutomation.getGCPServiceDetails();
        System.out.println(Arrays.asList(gcpServices));

        String[] googleDataCentres = coeAutomation.getGoogleDataCentreDetails();
        System.out.println(Arrays.asList(googleDataCentres));

        coeAutomation.getOnPremiseDetails();
        coeAutomation.getProjectDetails();
        coeAutomation.getLoadBalancerDetails();
    }
}
