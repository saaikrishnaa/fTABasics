package com.fta.handson.utils;

import com.aventstack.extentreports.ExtentTest;
import com.fta.handson.config.ConfigurationFactory;
import com.fta.handson.driver.DriverManager;
import com.fta.handson.enums.WaitStrategy;
import com.fta.handson.reports.ExtentLogger;
import com.fta.handson.reports.ExtentReport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtils {

    private WebElementUtils() {
    }

    public static void click(By by, String webElementName) {
        WebElement element = waitUntilElementPresence(by);
        element.click();
        ExtentLogger.pass(webElementName + " is clicked successfully");
    }

    public static void sendKeys(By by, String inputToTextBox, String webElementName) {
        WebElement element = waitUntilElementPresence(by);
        element.sendKeys(inputToTextBox);

        ExtentLogger.pass(inputToTextBox + " is entered successfully to - " + webElementName);
    }

    public static void click(By by, WaitStrategy waitStrategy, String webElementName) {
        WebElement element = null;

        if (waitStrategy == WaitStrategy.CLICKABLE) {
            element = waitUntilElementToBeClicked(by);
        } else if (waitStrategy == WaitStrategy.PRESENCE) {
            element = waitUntilElementPresence(by);
        } else {
            element = waitUntilElementToBeVisible(by);
        }
        element.click();
        ExtentLogger.pass(webElementName + " is clicked successfully");
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
