package com.fta.handson.tests;

import com.fta.handson.driver.DriverManager;
import com.fta.handson.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceDemoStandardUserLoginTest extends BaseTest{


    @DataProvider(name = "provide")
    public static Object[][] inputData() {
        return new Object[][]{
                {"standard_user","secret_sauce"}
        };
    }

    @Test(description = "To test the login functionality in Sauce Labs application",dataProvider = "provide")
    public void sauceLabsStandardUserLoginTest(String username, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage();

        DriverManager.getDriver().findElement(By.xpath("//input[@id='user-name']")).sendKeys(username); //Step1 - Normal way, without using Page Object Model
        loginPage.setUsername("standard_user");//Step2 is better than Step1 - using Page Object Model

        DriverManager.getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys(password); //Step1 - Normal way, without using Page Object Model
        loginPage.setPassword("secret_sauce");//Step2 is better than Step1 - using Page Object Model

        DriverManager.getDriver().findElement(By.xpath("//input[@type='submit']")).click(); //Step1 - Normal way, without using Page Object Model
        loginPage.clickLogin();//Step2 is better than Step1 - using Page Object Model

        DriverManager.getDriver().findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click(); //Step1 - Normal way, without using Page Object Model
//        loginPage.clickHamburgerMenu();//Step2 is better than Step1 - using Page Object Model

        DriverManager.getDriver().findElement(By.xpath("//a[@id='logout_sidebar_link']")).click(); //Step1 - Normal way, without using Page Object Model
//        loginPage.clickLogout();//Step2 is better than Step1 - using Page Object Model

        loginPage.loginToSauceDemoApplication(username,password);//Step3 is further better than Step2 - using the wrapper method
    }
}
