package com.fta.handson.earlier.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class InitialExtentReportsGenerator {

    public static void main(String[] args) {

        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-report.html"); // To have HTML Reports
        extent.attachReporter(spark);

        //Create Test - is a new Test Case for Extent Reports library
        ExtentTest loginTest = extent.createTest("Sauce Labs Demo - Login Tests");
        loginTest.log(Status.PASS, "Username is entered");
        loginTest.log(Status.PASS, "Password is entered");
        loginTest.log(Status.PASS, "Submit Button is clicked");
        loginTest.log(Status.PASS, "User is navigated to the home page");
        loginTest
                .assignDevice("Lenovo")
                .assignAuthor("lakshmi")
                .assignAuthor("vishnu")
                .assignAuthor("padmaja")
                .assignCategory("regression");

        ExtentTest homePageTest = extent.createTest("Sauce Labs Demo - Home Page Tests");
        homePageTest.log(Status.PASS, "Login is successful");
        homePageTest.log(Status.PASS, "Clicked on the product");
        homePageTest.log(Status.PASS, "Accessed the product details page");
        homePageTest.log(Status.PASS, "Added the product to cart");
        homePageTest.log(Status.PASS, "Clicked the checkout button");
        homePageTest.log(Status.PASS, "Payment is successful");
        homePageTest.log(Status.PASS, "Logout button is clicked");
        homePageTest.log(Status.FAIL,"Could not logout successfully, and gets navigated to the login page");
        homePageTest
                .assignDevice("Mac")
                .assignAuthor("lakshmi")
                .assignAuthor("vishnu")
                .assignAuthor("ska")
                .assignCategory("sanity");



        extent.flush(); // Creates the report, only after flush

    }

}
