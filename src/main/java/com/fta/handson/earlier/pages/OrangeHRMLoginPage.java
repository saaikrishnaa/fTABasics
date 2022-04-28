package com.fta.handson.earlier.pages;

import org.openqa.selenium.By;

public class OrangeHRMLoginPage {

    public static By txt_username = By.xpath("//*[@id='txtUsername']");
    public static By txt_password = By.xpath("//input[@id='txtUsername']/parent::div/following-sibling::div[1]/input");
    public static By btn_login = By.xpath("//input[@id='btnLogin']");
}