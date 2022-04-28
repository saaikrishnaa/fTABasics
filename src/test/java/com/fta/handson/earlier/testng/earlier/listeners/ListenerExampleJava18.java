package com.fta.handson.earlier.testng.earlier.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExampleJava18 implements ITestListener {
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
    public void onStart(ITestContext context) {
        System.out.println("Similar to BEFORE SUITE");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Similar to AFTER SUITE");
    }
}
