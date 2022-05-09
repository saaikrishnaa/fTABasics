package com.fta.handson.tests;

import com.fta.handson.annotations.FrameworkAnnotation;
import com.fta.handson.pages.LoginPage;
import com.fta.handson.pages.SauceLabsHomePage;
import com.fta.handson.pages.components.LeftMenuComponent;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceLabsHomePageTest extends BaseTest{

    @DataProvider
    public static Object[][] supplyData() {
        return new Object[][]{
                {"standard_user","secret_sauace"}
        };
    }

    @Test(description = "Logging saucedemo application using proper credentials, Navigating to the Home Page", dataProvider = "supplyData")
    @FrameworkAnnotation(authorName = "Lakshmi",category = "Smoke",devices = "Android")
        public void validateSauceLabsTitleTest(String username, String password){
        LoginPage loginPage = new LoginPage();

        loginPage.loginToSauceDemoApplication(username,password);

        LeftMenuComponent leftMenuComponent = new LeftMenuComponent();
        leftMenuComponent
                .clickHamburgerMenu()
                .clickAbout();

        SauceLabsHomePage sauceLabsHomePage = new SauceLabsHomePage();

        String actualValue = sauceLabsHomePage.getPageTitle();
        String expectedValue = "";

        Assert.assertEquals(actualValue, expectedValue);
    }

}
