package com.fta.handson.earlier.standalonetests.waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitAutomationTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //now we have maximized the browser window
        driver.manage().window().maximize();

        //i have to access a URL
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //explicit wait - applicable for the INDIVIDUAL web elements in this page
        WebDriverWait wait = new WebDriverWait(driver, 0);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));  // another way with newer versions of selenium

        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtUsername']/following::input[1]")).sendKeys("admin123");
        driver.findElement(By.className("button")).click();

        driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout")));

        driver.findElement(By.linkText("Logout")).click();
        driver.close();
    }
}
