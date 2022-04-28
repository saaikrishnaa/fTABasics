package com.fta.handson.standalonetests.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Desktop/sKA/courses/fTABasicsUSA/refer/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //now we have maximized the browser window
        driver.manage().window().maximize();

        //i have to access a URL
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtUsername']/following::input[1]")).sendKeys("admin123");
        driver.findElement(By.className("button")).click();

        driver.findElement(By.id("menu_directory_viewDirectory")).click();
        WebElement jobTitleDropdown = driver.findElement(By.id("searchDirectory_job_title"));

        Select select = new Select(jobTitleDropdown);

        select.selectByVisibleText("Automation Tester");
        Thread.sleep(1000);

        select.selectByIndex(5);
        Thread.sleep(1000);

        select.selectByValue("9");
        Thread.sleep(1000);

        //Retrieve all the dropdown values
        List<WebElement> jobTitles = select.getOptions();

        for (int i = 0; i < jobTitles.size(); i++) {
            System.out.println(jobTitles.get(i).getText());
        }

        driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();

        driver.close();
    }
}
