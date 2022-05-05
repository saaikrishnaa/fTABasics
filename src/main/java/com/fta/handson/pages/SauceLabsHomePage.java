package com.fta.handson.pages;

import com.fta.handson.driver.DriverManager;
import org.openqa.selenium.By;

public class SauceLabsHomePage {

    private static final By PAGE_TITLE = By.xpath("//a[@href='/']/parent::div[@class='nav-image']");

    public static String getPageTitle() {
        return DriverManager.getDriver().findElement(PAGE_TITLE).getText();
    }
}
