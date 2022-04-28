package com.fta.handson.earlier.config;

import org.openqa.selenium.By;

public class TestConstants {

    public static final By txtUsername = By.xpath("//*[@id='txtUsername']");
    public static final By txtPassword = By.xpath("//input[@id='txtUsername']/following::input[1]");

    public static final By btnSubmit = By.className("button");

    public static final By lnkWelcome = By.xpath("//a[contains(@href,'#')]");
    public static final By lnkLogout = By.linkText("Logout");

    public static final String ORANGEHRMLIVE_URL = "https://opensource-demo.orangehrmlive.com/";

    public static final String JQUERYUI_URL = "https://jqueryui.com/droppable/";

    public static final String FILEUPLOAD_URL = "https://demo.guru99.com/test/upload/";
}
