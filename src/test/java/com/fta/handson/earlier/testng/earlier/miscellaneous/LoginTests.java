package com.fta.handson.earlier.testng.earlier.miscellaneous;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //now we have maximized the browser window
        driver.manage().window().maximize();
    }

    @Test(description = "To test the login functionality in the Orange HRM Live application",enabled = false)
    public void orangeHRMLoginTest() throws InterruptedException {
        //To launch a URL
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //To maximize the window / Fullscreen
        driver.manage().window().maximize();

        //To access the username textbox web element using its DOM attribute, and input a value once after access
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        //To access the password textbox web element using its DOM attribute, and input a value once after access
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");

        //To access the submit button web element using its DOM attribute, and input a value once after access
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
    }

    @Test(description = "To test the login functionality in Sauce Labs application")
    public void sauceLabsLoginTest() throws InterruptedException {

        //To launch a URL
        driver.get("https://www.saucedemo.com/");

        //To maximize the window / Fullscreen
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        String actualValue = driver.findElement(By.className("title")).getText();
        String expectedValue = "PRODUCTS";

        Assert.assertEquals(actualValue, expectedValue);

        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
    }


    @AfterMethod
    public void tearDown() {
        //To close the browser instance
        driver.close();
    }
}
