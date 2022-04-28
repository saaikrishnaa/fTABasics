package com.fta.handson.standalonetests.actions;


import com.fta.handson.selenium.config.TestConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class ActionsMoveClickTest {

    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //now we have maximized the browser window
        driver.manage().window().maximize();

        //i have to access a URL
        driver.get(TestConstants.ORANGEHRMLIVE_URL);


        driver.findElement(TestConstants.txtUsername).sendKeys("Admin");
        driver.findElement(TestConstants.txtPassword).sendKeys("admin123");
        driver.findElement(TestConstants.btnSubmit).click();

        WebElement performanceTab = driver.findElement(By.xpath("//b[text()='Performance']"));

        Actions actions = new Actions(driver);

        actions
                .moveToElement(performanceTab)
                .perform();


        Thread.sleep(2000);

        WebElement manageReviewsSubTab = driver.findElement(By.xpath("//a[text()='Manage Reviews']"));
        actions.moveToElement(manageReviewsSubTab).build().perform();

        Thread.sleep(2000);

        WebElement reviewListOption = driver.findElement(By.xpath("//a[text()='Review List']"));
        WebElement myTrackersOption = driver.findElement(By.xpath("//a[text()='My Trackers']"));
        WebElement employeeTrackersOption = driver.findElement(By.xpath("//a[text()='Employee Trackers']"));
        WebElement adminTab = driver.findElement(By.xpath("//b[text()='Admin']"));
        WebElement pimTab = driver.findElement(By.xpath("//b[text()='PIM']"));

        actions
                .moveToElement(reviewListOption)
                .moveToElement(myTrackersOption)
                .moveToElement(employeeTrackersOption)
                .pause(Duration.ofSeconds(2))
                .moveToElement(adminTab)
                .pause(Duration.ofSeconds(2))
                .moveToElement(pimTab)
                .pause(Duration.ofSeconds(2))
                .moveToElement(performanceTab)
                .pause(Duration.ofSeconds(2))
                .moveToElement(manageReviewsSubTab)
                .pause(Duration.ofSeconds(2))
                .moveToElement(manageReviewsSubTab)
                .pause(Duration.ofSeconds(2))
                .click(reviewListOption)
                .build().perform();


        driver.findElement(TestConstants.lnkWelcome).click();

        Thread.sleep(2000);

        driver.findElement(TestConstants.lnkLogout).click();
        driver.close();
    }

}
