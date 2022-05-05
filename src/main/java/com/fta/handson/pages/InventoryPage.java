package com.fta.handson.pages;

import com.fta.handson.driver.DriverManager;
import com.fta.handson.pages.components.LeftMenuComponent;
import com.fta.handson.utils.WebElementUtils;
import org.openqa.selenium.By;

public class InventoryPage {

    private static final By BTN_ADDTOCART = By.xpath("//button[text()='Add to cart' and @id='add-to-cart-sauce-labs-backpack']");
    private static final By LNK_CART = By.className("shopping_cart_link");
    private static final By LNK_PRODUCTINCART = By.xpath("//div[text()='Sauce Labs Backpack']/parent::a[@href='#']");

    private LeftMenuComponent leftMenuComponent;

    public InventoryPage(){
        leftMenuComponent = new LeftMenuComponent(); //Composition - HAS - A relationship, one object having another object
    }

    public InventoryPage clickAddToCart() {
        DriverManager.getDriver().findElement(BTN_ADDTOCART).click();
        return this;
    }

    public InventoryPage clickCart() {
        DriverManager.getDriver().findElement(LNK_CART).click();
        return this;
    }

    public String validateProductInCart() {
        return DriverManager.getDriver().findElement(LNK_PRODUCTINCART).getText();
    }

    public void logout(){
        leftMenuComponent.logoutFromSauceDemoApplication();
    }


}
