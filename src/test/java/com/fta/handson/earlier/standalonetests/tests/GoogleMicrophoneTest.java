package com.fta.handson.earlier.standalonetests.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleMicrophoneTest {

    @Test
    public void googleMicrophoneTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //now we have maximized the browser window
        driver.manage().window().maximize();

        //i have to access a URL
        driver.get("https://www.google.com");

        WebElement googleMicrophone = driver.findElement(By.xpath("//*[local-name()='svg']/parent::div[@jscontroller='unV4T']"));
//        WebElement microphone = driver.findElement(By.xpath("//*[name()='svg']/parent::div[@jscontroller='unV4T']"));
//        Actions actions = new Actions(driver);
//        actions
//                .moveToElement(googleMicrophone)
//                .click()
//                .build()
//                .perform();

        Thread.sleep(5000);
        driver.close();
    }
}
