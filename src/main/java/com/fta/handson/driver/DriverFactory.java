package com.fta.handson.driver;

import com.fta.handson.config.ConfigurationFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public final class DriverFactory {

    private DriverFactory() {
    }

    private static WebDriver driver;

    public static WebDriver getDriver(String browserName, String runEnvironment) {

        boolean isHeadless = ConfigurationFactory.getConfig().isHeadless();

        if (runEnvironment.equalsIgnoreCase("local")) {
            driver = LocalDriverFactory.getLocalDriverInstance(browserName, isHeadless);
        } else {
            driver = RemoteDriverFactory.getRemoteDriverInstance(browserName, isHeadless);
        }
        return driver;
    }
}
