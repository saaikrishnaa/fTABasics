package com.fta.handson.tests;

import com.fta.handson.driver.Driver;
import com.fta.handson.driver.DriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SauceDemoLockedOutUserLoginTest extends BaseTest {

    @Test(description = "To test the login functionality in Sauce Labs application")
    public void sauceLabsLockedOutUserLoginTest() throws InterruptedException {

        Driver.initDriver();

        DriverManager.getDriver().findElement(By.xpath("//input[@id='user-name']")).sendKeys("locked_out_user");
        DriverManager.getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        DriverManager.getDriver().findElement(By.xpath("//input[@type='submit']")).click();
    }
}
