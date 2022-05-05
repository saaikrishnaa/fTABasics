package com.fta.handson.pages;

import com.fta.handson.utils.WebElementUtils;
import org.openqa.selenium.By;

public class LoginPage {

    private static final By TXT_USERNAME = By.xpath("//input[@id='user-name']");
    private static final By TXT_PASSWORD = By.xpath("//input[@id='password']");
    private static final By BTN_SUBMIT = By.xpath("//input[@type='submit']");

    public LoginPage setUsername(String username) {
        WebElementUtils.sendKeys(TXT_USERNAME, username);
        return this;
    }

    public LoginPage setPassword(String password) {
        WebElementUtils.sendKeys(TXT_PASSWORD, password);
        return this;
    }

    public InventoryPage clickLogin() {
        WebElementUtils.click(BTN_SUBMIT);
        return new InventoryPage();
    }

    //WRAPPER METHOD
    public InventoryPage loginToSauceDemoApplication(String username, String password) {
        return setUsername(username).setPassword(password).clickLogin();// Advantage of Method Chaining - Better Readability
    }

}
