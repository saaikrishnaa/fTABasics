package com.fta.handson.utils;

import com.fta.handson.config.ConfigurationFactory;
import com.fta.handson.driver.DriverManager;
import com.fta.handson.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtils {

    private WebElementUtils() {
    }

    public static void click(By by) {
        WebElement element = waitUntilElementPresence(by);
        element.click(); // TODO - furthermore efficient way instead the above way, discuss WHY?
    }

    public static void sendKeys(By by, String inputToTextBox) {
        WebElement element = waitUntilElementPresence(by);
        element.sendKeys(inputToTextBox); // TODO - furthermore efficient way instead the above way, discuss WHY?
    }

    public static void click(By by, WaitStrategy waitStrategy) {
        WebElement element = null;

        if (waitStrategy == WaitStrategy.CLICKABLE) {
            element = waitUntilElementToBeClicked(by);
        } else if (waitStrategy == WaitStrategy.PRESENCE) {
            element = waitUntilElementPresence(by);
        } else {
            element = waitUntilElementToBeVisible(by);
        }
        element.click();
    }

    private static WebElement waitUntilElementToBeVisible(By by) {
        WebDriverWait explicitWait = new WebDriverWait(DriverManager.getDriver(), ConfigurationFactory.getConfig().duration());
        return explicitWait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    private static WebElement waitUntilElementToBeClicked(By by) {
        WebDriverWait explicitWait = new WebDriverWait(DriverManager.getDriver(), ConfigurationFactory.getConfig().duration());
        return explicitWait.until(ExpectedConditions.elementToBeClickable(by));
    }

    private static WebElement waitUntilElementPresence(By by) {
        WebDriverWait explicitWait = new WebDriverWait(DriverManager.getDriver(), ConfigurationFactory.getConfig().duration());
        return explicitWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

}
