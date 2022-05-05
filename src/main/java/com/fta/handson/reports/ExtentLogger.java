package com.fta.handson.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.fta.handson.utils.ScreenshotUtils;

public final class ExtentLogger {

    private ExtentLogger(){
    }

    public static void pass(String message){
//        ExtentManager.getTest().pass(message);
        ExtentManager.getTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.captureScreenshot()).build());
    }

    public static void fail(String message){
//        ExtentManager.getTest().fail(message);
        ExtentManager.getTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.captureScreenshot()).build());
    }

    public static void info(String message){
//        ExtentManager.getTest().info(message);
        ExtentManager.getTest().info(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.captureScreenshot()).build());
    }
}
