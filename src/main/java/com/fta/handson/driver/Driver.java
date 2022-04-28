package com.fta.handson.driver;

import com.fta.handson.config.ConfigurationFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public final class Driver {

    private Driver(){}

    public static void initDriver() {
        String browser = ConfigurationFactory.getConfig().browser();
        WebDriver driver = DriverFactory.getDriver(browser);

        DriverManager.setDriver(driver);

        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(ConfigurationFactory.getConfig().duration(), TimeUnit.SECONDS);
        DriverManager.getDriver().get(ConfigurationFactory.getConfig().url());
    }

    public static void quitDriver() {
        DriverManager.getDriver().quit();
    }
}
