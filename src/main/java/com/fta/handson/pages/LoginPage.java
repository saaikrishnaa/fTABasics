package com.fta.handson.pages;

import com.fta.handson.driver.DriverManager;
import org.openqa.selenium.By;

public class LoginPage {

    private static final By TXT_USERNAME = By.xpath("//input[@id='user-name']");
    private static final By TXT_PASSWORD = By.xpath("//input[@id='password']");
    private static final By BTN_SUBMIT = By.xpath("//input[@type='submit']");

    public LoginPage setUsername(String username) {
        DriverManager.getDriver().findElement(TXT_USERNAME).sendKeys(username);
//        return new LoginPage();// you can chain this way or use this
        return this;
    }

    public LoginPage setPassword(String password) {
        DriverManager.getDriver().findElement(TXT_PASSWORD).sendKeys(password);
//        return new LoginPage();// you can chain this way or use this
        return this;
    }

    public InventoryPage clickLogin() {
        DriverManager.getDriver().findElement(BTN_SUBMIT).click();
        return new InventoryPage();
    }

    //WRAPPER METHOD
    public InventoryPage loginToSauceDemoApplication(String username, String password){
        return setUsername(username)
                .setPassword(password)
                .clickLogin();// Advantage of Method Chaining - Better Readability

//        //Without using Method Chaining
//        setUsername(username);
//        setPassword(password);
//        clickLogin();
    }

}
