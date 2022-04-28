package com.fta.handson.standalonetests.actions;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class KeyboardActionsTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //Navigate to the demo site
        driver.get("https://demoqa.com/text-box");


        //Create object of the Actions class
        Actions actions = new Actions(driver);


        // Enter the Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("James Bond");

        //Enter the Email
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("Bond@detective.com");


        // Enter the Current Address
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));

        currentAddress.sendKeys("333 Parker Lane U.S ASD332 2RT4");


        // Select the Current Address using CTRL + A
        actions
                .keyDown(Keys.CONTROL)
                .sendKeys("A")
                .keyUp(Keys.CONTROL)
                .build()
                .perform();

        // Copy the Current Address using CTRL + C
        actions
                .keyDown(Keys.CONTROL)
                .sendKeys("C")
                .keyUp(Keys.CONTROL)
                .build()
                .perform();

        //Press the TAB Key to Switch Focus to Permanent Address
        actions.sendKeys(Keys.TAB);
        actions.build().perform();

        //Paste the Address in the Permanent Address field using CTRL + V
        actions
                .keyDown(Keys.CONTROL)
                .sendKeys("V")
                .keyUp(Keys.CONTROL)
                .pause(Duration.ofSeconds(2))
                .build().perform();


        driver.close();

    }

}
