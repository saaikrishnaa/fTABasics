package com.fta.handson.driver;

import org.openqa.selenium.WebDriver;

import java.util.List;

public final class DriverManager {

    private static final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    private DriverManager(){}

    public static WebDriver getDriver() {
        return threadLocal.get();
    }

    public static void setDriver(WebDriver driver) {
        threadLocal.set(driver);
    }

}
