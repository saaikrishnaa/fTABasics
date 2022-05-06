package com.fta.handson.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.fta.handson.constants.FrameworkConstants;

public final class ExtentReport {

    private ExtentReport() {
    }

    public static ExtentReports extent;
    public static ExtentTest extentTest;

    public static void initReports() {
        extent = new ExtentReports();
        ExtentSparkReporter reporter = new ExtentSparkReporter(FrameworkConstants.getReportPath());
        extent.attachReporter(reporter);
    }

    public static void createTest(String automatedTestName) {
        extentTest = extent.createTest(automatedTestName);
        ExtentManager.setTest(extentTest);
    }

    public static void assignAuthor(String authorName){
        ExtentManager.getTest().assignAuthor(authorName);
    }

    public static void assignCategory(String testCategory){
        ExtentManager.getTest().assignCategory(testCategory);
    }

    public static void assignDevices(String deviceType){
        ExtentManager.getTest().assignDevice(deviceType);
    }

    public static void flushReports() {
        extent.flush();
    }

}
