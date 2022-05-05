package com.fta.handson.tests;

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
                {"standard_user","secret_sauce"}
        };
    }

    @Test(description = "To test the title of the Sauce Labs Home Page", dataProvider = "supplyData")
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
