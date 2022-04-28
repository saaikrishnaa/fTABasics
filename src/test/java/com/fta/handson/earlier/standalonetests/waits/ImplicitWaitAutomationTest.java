package com.fta.handson.earlier.standalonetests.waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class ImplicitWaitAutomationTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //now we have maximized the browser window
        driver.manage().window().maximize();

        //i have to access a URL
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //implicit wait - applicable for ALL the web elements in this page
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));  // another way with newer versions of selenium

        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtUsername']/following::input[1]")).sendKeys("admin123");
        driver.findElement(By.className("button")).click();
        driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();
        driver.findElement(By.linkText("Logout")).click();
        driver.close();
    }
}
