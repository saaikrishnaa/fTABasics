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
//        LoginPage loginPage = new LoginPage();
        DriverManager.getDriver().findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        DriverManager.getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        DriverManager.getDriver().findElement(By.xpath("//input[@type='submit']")).click();
//        loginPage.loginToSauceDemoApplication(username, password);

        InventoryPage inventoryPage = new InventoryPage();

        DriverManager.getDriver().findElement(By.xpath("//button[text()='Add to cart' and @id='add-to-cart-sauce-labs-backpack']")).click(); //Step1
//        inventoryPage.clickAddToCart();//Step2 is better than Step1

        DriverManager.getDriver().findElement(By.className("shopping_cart_link")).click();
//        inventoryPage.clickCart();//Step2 is better than Step1

        String actualValue = DriverManager.getDriver().findElement(By.xpath("//div[text()='Sauce Labs Backpack']/parent::a[@href='#']")).getText(); //Step1
//        String actualValue = inventoryPage.validateProductInCart();//Step2 is better than Step1

        //With method chaining, this will be much readable like below, you can further refine step - 2 as below
//        String actualValue = inventoryPage
//                .clickAddToCart()
//                .clickCart()
//                .validateProductInCart();

//        String expectedValue = "Sauce Labs Backpack"; // Rule - Never Hard Code, if possible, use data provider or a constants class, and read values from them

        Assert.assertEquals(actualValue, expectedValue);

//        DriverManager.getDriver().findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
//        DriverManager.getDriver().findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
    }
}
