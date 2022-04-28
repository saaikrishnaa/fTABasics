package com.fta.handson.fw.tests;

import com.fta.handson.fw.driver.DriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SauceDemoStandardUserLoginTest extends BaseTest{

    @Test(description = "To test the login functionality in Sauce Labs application")
    public void sauceLabsStandardUserLoginTest() throws InterruptedException {
        DriverManager.getDriver().findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        DriverManager.getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        DriverManager.getDriver().findElement(By.xpath("//input[@type='submit']")).click();
        DriverManager.getDriver().findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        DriverManager.getDriver().findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
    }
}
