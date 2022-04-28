package com.fta.handson.testng.jsexecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class JavaScriptExecutorTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

//    @Test
    public void hardScrollNotAdvisableTest() throws InterruptedException {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0, 2000)");

        Thread.sleep(4000);
    }

//    @Test
    public void scrollToCompleteHeightTest() throws InterruptedException {
        WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(5000);
    }

//    @Test
    public void scrollToParticularElementTest() throws InterruptedException {
        WebElement offers = driver.findElement(By.xpath("//a[text()='See all offers']"));

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", offers);

        Thread.sleep(3000);
    }

//    @Test
    public void scrollToParticularElementClickTest() throws InterruptedException {
        WebElement deals = driver.findElement(By.xpath("//a[text()='See all deals']"));

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].click();", deals);

        Thread.sleep(3000);
    }

    @Test
    public void clickOnPopUpTest() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("alert('Popup window');");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
//        driver.switchTo().alert().accept();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(enabled = false)
    public void takeScreenshotAfterDoingAnActionTest() throws IOException, InterruptedException {
        WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].click();", help);

        TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
        File actualScreenshotStoredInMemory = takesScreenshot.getScreenshotAs(OutputType.FILE);

        File screenshotInFile = new File(System.getProperty("user.dir")+"/src/test/resources/screen-references/first.png");
        FileUtils.copyFile(actualScreenshotStoredInMemory,screenshotInFile);

        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
