package com.fta.handson.standalonetests.initial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Comments are FYR
public class FirstSeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        //To launch the browser using the executable file which will talk with the browser
        System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/Desktop/sKA/courses/fTABasicsUSA/refer/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();//52522523532




        //To launch a URL
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //To maximize the window / Fullscreen
        driver.manage().window().maximize();

        //To access the username textbox web element using its DOM attribute, and input a value once after access
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        //To access the password textbox web element using its DOM attribute, and input a value once after access
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");

        //To access the submit button web element using its DOM attribute, and input a value once after access
        driver.findElement(By.id("btnLogin")).click();
//
        driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();

        //To close the browser instance
        driver.close();
    }
}
