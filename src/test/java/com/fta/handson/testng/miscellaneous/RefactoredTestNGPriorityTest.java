package com.fta.handson.testng.miscellaneous;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RefactoredTestNGPriorityTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //To launch a URL
        driver.get("https://www.saucedemo.com/");

        //To maximize the window / Fullscreen
        driver.manage().window().maximize();
    }


    @Test(priority = 0)
    public void sauceLabsValidCredentialsTest() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        String actualValue = driver.findElement(By.className("title")).getText();
        String expectedValue = "PRODUCTS";

        Assert.assertEquals(actualValue, expectedValue);

        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
    }

    @Test(priority = 1)
    public void sauceLabsInvalidCredentialsLoginTest() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("wrong_password");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        String expectedValue = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        String actualValue = "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(expectedValue, actualValue);
    }

    @AfterMethod
    public void tearDown(){
        //To close the browser instance
        driver.close();
    }

}