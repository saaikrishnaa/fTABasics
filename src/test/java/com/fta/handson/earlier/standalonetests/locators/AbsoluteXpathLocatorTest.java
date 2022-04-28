package com.fta.handson.earlier.standalonetests.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Comments are FYR
public class AbsoluteXpathLocatorTest {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/Desktop/sKA/courses/fTABasicsUSA/refer/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

        //Locator - Absolute Xpath - for Username
//        driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
        driver.findElement(By.xpath("html/body/div/div/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");

        //Locator - Absolute Xpath - for Password
        driver.findElement(By.xpath("html/body/div/div/div/div[2]/div[2]/form/div[3]/input")).sendKeys("admin123");

        //Locator - Absolute Xpath - for Login button
//        driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();

        //Locator - Absolute Xpath - for "Forgot your password" button
        driver.findElement(By.xpath("html/body/div/div/div/div[2]/div[2]/form/div[5]/div/a")).click();


        //Basic Wait Strategy - Let's discuss later - NOT suggestable to use - Not for wait, rather to be used in multi threading
        Thread.sleep(3000);


        //To close the browser instance
        driver.close();
    }
}
