package com.fta.handson.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {

    private static final ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<>();

    private ExtentManager(){}

    static ExtentTest getTest() {
        return threadLocal.get();
    }

    static void setTest(ExtentTest test) {
        threadLocal.set(test);
    }

}
