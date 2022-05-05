package com.fta.handson.pages;

import com.aventstack.extentreports.Status;
import com.fta.handson.enums.WaitStrategy;
import com.fta.handson.reports.ExtentLogger;
import com.fta.handson.reports.ExtentManager;
import com.fta.handson.utils.WebElementUtils;
import org.openqa.selenium.By;

import static com.fta.handson.utils.WebElementUtils.click;
import static com.fta.handson.utils.WebElementUtils.sendKeys;

public class LoginPage {

    private static final By TXT_USERNAME = By.xpath("//input[@id='user-name']");
    private static final By TXT_PASSWORD = By.xpath("//input[@id='password']");
    private static final By BTN_SUBMIT = By.xpath("//input[@type='submit']");

    private LoginPage setUsername(String username) {
        sendKeys(TXT_USERNAME, username, "Username");
        return this;
    }

    private LoginPage setPassword(String password) {
        sendKeys(TXT_PASSWORD, password, "Password");
        return this;
    }

    private InventoryPage clickLogin() {
//        WebElementUtils.click(BTN_SUBMIT,"presence"); //Avoid hard coding, which leads to unknowing Typos, thereby Exceptions
        click(BTN_SUBMIT, WaitStrategy.PRESENCE,"Login Button");
        return new InventoryPage();
    }

    //WRAPPER METHOD
    public InventoryPage loginToSauceDemoApplication(String username, String password) {
        return setUsername(username).setPassword(password).clickLogin();// Advantage of Method Chaining - Better Readability
    }

}
