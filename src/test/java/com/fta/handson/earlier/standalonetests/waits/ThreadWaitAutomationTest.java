package com.fta.handson.earlier.standalonetests.waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ThreadWaitAutomationTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //now we have maximized the browser window
        driver.manage().window().maximize();

        //i have to access a URL
        driver.get("https://opensource-demo.orangehrmlive.com/");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='txtUsername']/following::input[1]")).sendKeys("admin123");

        Thread.sleep(3000);

        driver.findElement(By.className("button")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();

        Thread.sleep(2000); //EXACT PLACE WHERE WAIT STRATEGY's USE CAN BE UNDERSTOOD

        driver.findElement(By.linkText("Logout")).click();

        Thread.sleep(3000);

        driver.close();
    }
}
