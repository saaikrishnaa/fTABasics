package com.fta.handson.standalonetests.optimize;


import com.fta.handson.selenium.config.TestConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OptimizedAutomationTest {

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

        driver.findElement(TestConstants.lnkWelcome).click();
        Thread.sleep(2000);
        driver.findElement(TestConstants.lnkLogout).click();
        driver.close();
    }

}
