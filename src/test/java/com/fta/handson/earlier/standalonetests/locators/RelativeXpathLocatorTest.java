package com.fta.handson.earlier.standalonetests.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Comments are FYR
public class RelativeXpathLocatorTest {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/Desktop/sKA/courses/fTABasicsUSA/refer/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://opensource-demo.orangehrmlive.com/");


        driver.manage().window().maximize();


        //Locator - Relative Xpath - for Username - using id
//        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']/ancestor::div[3]/div[2]/form/div[2]/input")).sendKeys("Admin");


        //Locator - Relaive Xpath - for Password - using name
//        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
//        driver.findElement(By.xpath("//input[@id='txtUsername']/parent::div/following-sibling::div/input[@name='txtPassword']")).sendKeys("admin123");
//        driver.findElement(By.xpath("//input[@id='txtUsername']/following::input[1]")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='txtUsername']/../../div[3]/input[@name='txtPassword']")).sendKeys("admin123");

        //Locator - Relative Xpath - for "Forgot your password" button - using text()
        driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();

        //Locator - Relative Xpath - for "Forgot your password" button - using contains
//        driver.findElement(By.xpath("//a[contains(@href,'/request')]")).click();


        //Locator - Relative Xpath - for Login button - Combining Xpath Expressions using and, or
//        driver.findElement(By.xpath("//input[@class='button' and @name='Submit']")).click();

//        driver.findElement(By.xpath("//a[text()='Forgot your password?' or contains(@href,'/auth')]")).click();
//        driver.findElement(By.xpath("//a[contains(@href,'index.php')]")).click();

        //Basic Wait Strategy - Let's discuss later - Not suggestable to use
        Thread.sleep(1000);


        //To close the browser instance
        driver.close();
    }
}
