package com.fta.handson.testng.docker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RunAutometedTestInDockerWithAWSEC2Test {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");

        driver = new RemoteWebDriver(new URL("http://ec2-44-203-210-209.compute-1.amazonaws.com:4444"), capabilities);
        driver.manage().window().maximize();
    }

    @Test(description = "To test the login functionality in the Orange HRM Live application", enabled = false)
    public void orangeHRMLoginTest() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//        driver.findElement(By.id("btnLogin")).click();
//        driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("Logout")).click();
    }

    @Test(description = "To test the login functionality in Sauce Labs application")
    public void sauceLabsLoginTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
