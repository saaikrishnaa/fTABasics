package com.fta.handson.earlier.testng.earlier.miscellaneous;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutTestNGSecondTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //To launch a URL
        driver.get("https://www.saucedemo.com/");

        //To maximize the window / Fullscreen
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        String actualValue = driver.findElement(By.className("title")).getText();
        String expectedValue = "produsscts";

        if(actualValue.equalsIgnoreCase(expectedValue)){
            System.out.println("Test is successful");
        }else{
            System.out.println("Test is not successful");
        }

        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();

        //To close the browser instance
        driver.close();
    }

}
