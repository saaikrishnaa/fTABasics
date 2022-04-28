package com.fta.handson.earlier.standalonetests.optimize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExistingAutomationTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //now we have maximized the browser window
        driver.manage().window().maximize();

        //i have to access a URL
        driver.get("https://opensource-demo.orangehrmlive.com/");


        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtUsername']/following::input[1]")).sendKeys("admin123");
        driver.findElement(By.className("button")).click();

        driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();
        driver.findElement(By.linkText("Logout")).click();
        driver.close();
    }
}
