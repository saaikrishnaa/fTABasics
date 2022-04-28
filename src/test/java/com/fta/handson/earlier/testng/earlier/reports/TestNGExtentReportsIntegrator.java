package com.fta.handson.earlier.testng.earlier.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGExtentReportsIntegrator {
    ExtentReports extent;
    WebDriver driver;
    ExtentTest test;


    @BeforeSuite
    public void beforeSuite() {
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/extent-report.html");
        extent.attachReporter(spark);
    }

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        test = extent.createTest("Login Tests");
    }

    @Test(description = "To test the login functionality in the Orange HRM Live application")
    public void orangeHRMLoginTest() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        test.log(Status.PASS,"logged into application");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        test.log(Status.PASS,"entered un");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        test.log(Status.PASS,"entered pwd");
        driver.findElement(By.id("btnLogin")).click();
        test.log(Status.PASS,"clicked on login button");
        driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();
        test.log(Status.PASS,"clicking on the user icon");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
        test.log(Status.PASS,"clicked on logout hyperlink");

        test.assignCategory("smoke","sanity");
        test.assignAuthor("vishnu","lakshmi","padmaja");
        test.assignDevice("android");
    }

    @Test(description = "To test the login functionality in Sauce Labs application")
    public void sauceLabsLoginTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        test.log(Status.PASS,"logged into application");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        test.log(Status.PASS,"entered un");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        test.log(Status.PASS,"entered pwd");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        test.log(Status.PASS,"clicked on login button");
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        test.log(Status.PASS,"logged into application");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
        test.log(Status.PASS,"clicked on logout hyperlink");

        test.assignCategory("regression");
        test.assignDevice("windows");
        test.assignAuthor("sai","dravid");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @AfterSuite
    public void afterSuite() {
        extent.flush();
    }

}
