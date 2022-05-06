package com.fta.handson.tests;

import com.fta.handson.annotations.FrameworkAnnotation;
import com.fta.handson.driver.DriverManager;
import com.fta.handson.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceDemoStandardUserLoginTest extends BaseTest {

    @DataProvider(name = "provide")
    public static Object[][] inputData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"}
        };
    }

    @Test(description = "To test the login functionality in Sauce Labs application", dataProvider = "provide")
    @FrameworkAnnotation(authorName = "Padmaja",category = "Regression",devices = "Tablet")
    public void sauceLabsStandardUserLoginTest(String username, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToSauceDemoApplication(username, password);
    }
}
