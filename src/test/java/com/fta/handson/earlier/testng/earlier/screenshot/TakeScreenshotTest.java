package com.fta.handson.earlier.testng.earlier.screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenshotTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(description = "To test the login functionality in the Orange HRM Live application")
    public void orangeHRMLoginTest() throws InterruptedException, IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");

        TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
        File screenshotSavedInMemory = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File screenshotAsAFile = new File(System.getProperty("user.dir").concat("/src/test/resources/screenshots/orange-hrm.png"));
        FileUtils.copyFile(screenshotSavedInMemory,screenshotAsAFile);


//        driver.findElement(By.id("btnLogin")).click();



//        driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("Logout")).click();
    }

    @Test(description = "To test the login functionality in Sauce Labs application")
    public void sauceLabsLoginTest() throws InterruptedException, IOException {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
        File screenshotSavedInMemory = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File screenshotAsAFile = new File(System.getProperty("user.dir").concat("/src/test/resources/screenshots/sauce-demo.png"));
        FileUtils.copyFile(screenshotSavedInMemory,screenshotAsAFile);

        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
    }


    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
