package com.fta.handson.tests;

import com.fta.handson.annotations.FrameworkAnnotation;
import com.fta.handson.driver.Driver;
import com.fta.handson.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceDemoLockedOutUserLoginTest extends BaseTest {

    @DataProvider(name = "supply")
    public static Object[][] supplyData() {
        return new Object[][]{
                {"locked_out_user", "secret_saucea"}
        };
    }

    @Test(description = "Logging saucedemo application using locked out credentials", dataProvider = "supply")
    @FrameworkAnnotation(authorName = "SK", category = "Regression", devices = "Android")
    public void sauceLabsLockedOutUserLoginTest(String username, String password) throws InterruptedException {
        Driver.initDriver();//Even if multiple times WebDriver is instantiated, we will not invoke multiple browser instances

        LoginPage loginPage = new LoginPage();
        loginPage.loginToSauceDemoApplication(username, password);
    }
}
