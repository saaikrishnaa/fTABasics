package com.fta.handson.earlier.standalonetests.initial;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManagerFirstSeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //To launch a URL
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //To maximize the window / Fullscreen
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.className("button")).click();

        String actualValue = driver.getTitle();
        String expectedValue = "OrangeHRM";

        if(actualValue.equalsIgnoreCase(expectedValue)){
            System.out.println("Test is successful");
        }else{
            System.out.println("Test is not succesful");
        }

        driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();

        //To close the browser instance
        driver.close();
    }

}
