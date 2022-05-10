package com.fta.handson.driver;

import com.fta.handson.config.ConfigurationFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class RemoteDriverFactory {

    private RemoteDriverFactory() {
    }

    private static WebDriver driver;

    @SneakyThrows
    public static WebDriver getRemoteDriverInstance(String browserName, boolean isHeadless) {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        if (isHeadless) {
            if (browserName.equalsIgnoreCase("chrome")) {
                desiredCapabilities.setCapability("headless", true);
                desiredCapabilities.setBrowserName("chrome");
            } else if (browserName.equalsIgnoreCase("firefox")) {
                desiredCapabilities.setCapability("headless", true);
                desiredCapabilities.setBrowserName("firefox");
            }
        } else {
            if (browserName.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            driver = new RemoteWebDriver(new URL(ConfigurationFactory.getConfig().remoteUrl()), desiredCapabilities);
        }

        return driver;
    }
}
