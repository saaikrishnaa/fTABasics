package com.fta.handson.tests;

import com.fta.handson.driver.Driver;
import com.fta.handson.driver.DriverManager;
import com.fta.handson.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceDemoLockedOutUserLoginTest extends BaseTest {

    @DataProvider(name = "supply")
    public static Object[][] supplyData() {
        return new Object[][]{
                {"locked_out_user", "secret_sauce"}
        };
    }

    @Test(description = "To test the login functionality in Sauce Labs application", dataProvider = "supply")
    public void sauceLabsLockedOutUserLoginTest(String username, String password) throws InterruptedException {

        Driver.initDriver();//Even if multiple times WebDriver is instantiated, we will not invoke multiple browser instances

        LoginPage loginPage = new LoginPage();
        loginPage.loginToSauceDemoApplication(username, password);
    }
}
