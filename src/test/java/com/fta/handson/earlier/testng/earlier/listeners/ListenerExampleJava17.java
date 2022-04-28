package com.fta.handson.earlier.testng.earlier.listeners;

import com.aventstack.extentreports.ExtentReports;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExampleJava17 implements ITestListener{

    ExtentReports extent;

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getMethod().getDescription()+" is started");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName()+" is success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName()+" is fail");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getName()+" is skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {

        System.out.println("Similar to BEFORE SUITE");
//        extent = new ExtentReports();
//        ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/extent-report.html");
//        extent.attachReporter(spark);
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Similar to AFTER SUITE");
    }
}
