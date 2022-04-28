package com.fta.handson.earlier.standalonetests.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsTest {

    public static void main(String[] args) {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/extent-report.html");
        extent.attachReporter(spark);

        extent
                .createTest("OrangeHRM Test")
                .log(Status.PASS,"Now I am updating the information of my automated test in OrangeHRM in Extent Reports")
                .log(Status.FAIL,"Entering UN and PWd")
                .log(Status.INFO,"Clicking login button")
                .log(Status.WARNING,"Now I am updating the information of my automated test in OrangeHRM in Extent Reports")
                .log(Status.SKIP,"Now I am updating the information of my automated test in OrangeHRM in Extent Reports")
                .log(Status.PASS,"Now I am updating the information of my automated test in OrangeHRM in Extent Reports")
                .log(Status.FAIL,"Now I am updating the information of my automated test in OrangeHRM in Extent Reports")
                .assignAuthor("vishnu")
                .assignCategory("smoke","sanity","regression")
                .assignDevice("mac","android");

        extent.flush();
    }
}
