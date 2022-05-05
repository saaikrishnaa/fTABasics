package com.fta.handson.tests;

import com.fta.handson.driver.DriverManager;
import com.fta.handson.pages.InventoryPage;
import com.fta.handson.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceDemoStandardUserLoginAddToCartTest extends BaseTest {

    @DataProvider
    public static Object[][] provideData() {
        return new Object[][]{
                {"standard_user","secret_sauce","Sauce Labs Backpack"}
        };
    }

    @Test(description = "To test the login functionality in Sauce Labs application", dataProvider = "provideData")
    public void sauceLabsStandardUserLoginAddToCartTest(String username, String password,String expectedValue) throws InterruptedException {
        LoginPage loginPage = new LoginPage();

        loginPage.loginToSauceDemoApplication(username, password);

        InventoryPage inventoryPage = new InventoryPage();

        String actualValue = inventoryPage
                .clickAddToCart()
                .clickCart()
                .validateProductInCart();

        Assert.assertEquals(actualValue, expectedValue);

        inventoryPage.logout();
    }
}
