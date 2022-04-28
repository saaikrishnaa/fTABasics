package com.fta.handson.earlier.testng.earlier.dataprovider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstDataProviderTest {

    WebDriver driver;

    @DataProvider(parallel = true)
    public static Object[][] credentialsProvider() {
        return new Object[][]{
                {"standard_user","secret_sauce"},
                {"locked_out_user","secret_sauce"},
                {"problem_user","secret_sauce"},
                {"performance_glitch_user","secret_sauce"}
        };
    }

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //now we have maximized the browser window
        driver.manage().window().maximize();
    }

    @Test(description = "To test the login functionality in Sauce Labs application",dataProvider = "credentialsProvider")
    public void sauceLabsLoginTest(String username, String password) throws InterruptedException {

        //To launch a URL
        driver.get("https://www.saucedemo.com/");

        //To maximize the window / Fullscreen
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
//
//        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
    }


    @AfterMethod
    public void tearDown() {
        //To close the browser instance
        driver.close();
    }
}
