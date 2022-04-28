package com.fta.handson.earlier.standalonetests.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Comments are FYR
public class VariousLocatorsTest {
    public static void main(String[] args) throws InterruptedException {

        //To launch the browser using the executable file which will talk with the browser
        System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/Desktop/sKA/courses/fTABasicsUSA/refer/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // different day

        //To launch a URL
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //To maximize the window
        driver.manage().window().maximize();

        //To access the username textbox web element using its DOM attribute, and input a value once after access
        //Locator 1 - Id
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        //To access the password textbox web element using its DOM attribute, and input a value once after access
        //Locator 2 - Name
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");

        //To access the submit button web element using its DOM attribute, and input a value once after access
//        driver.findElement(By.id("btnLogin")).click();

        //Locator 3 - LinkText
//       driver.findElement(By.linkText("Forgot your password?")).click();

        //Locator 4 - Partial Link Text
        driver.findElement(By.partialLinkText("password")).click();

        //Locator 5 - Class
//        driver.findElement(By.className("button")).click();


        //Basic Wait Strategy - Let's discuss later - Not suggestable to use
        Thread.sleep(2000);


        //To close the browser instance
        driver.close();
    }
}
