package com.fta.handson.pages.components;

import com.fta.handson.driver.DriverManager;
import org.openqa.selenium.By;

public class LeftMenuComponent {

    private static final By LNK_HAMBURGER = By.xpath("//button[@id='react-burger-menu-btn']");
    private static final By LNK_LOGOUT = By.xpath("//a[@id='logout_sidebar_link']");
    private static final By LNK_ABOUT = By.xpath("//a[@id='about_sidebar_link']");

    public LeftMenuComponent clickHamburgerMenu() {
        DriverManager.getDriver().findElement(LNK_HAMBURGER).click();
        return this;
    }

    private LeftMenuComponent clickLogout() {
        DriverManager.getDriver().findElement(LNK_LOGOUT).click();
        return this;
    }

    public LeftMenuComponent clickAbout(){
        DriverManager.getDriver().findElement(LNK_ABOUT).click();
        return this;
    }

    //WRAPPER METHOD
    public void logoutFromSauceDemoApplication(){
        //Without using Method Chaining
//        clickHamburgerMenu();
//        clickLogout();

        clickHamburgerMenu()
                .clickLogout(); // Advantage of Method Chaining - Better Readability
    }
}
