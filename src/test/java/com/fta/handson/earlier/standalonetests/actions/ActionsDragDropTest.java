package com.fta.handson.earlier.standalonetests.actions;


import com.fta.handson.earlier.config.TestConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsDragDropTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //now we have maximized the browser window
        driver.manage().window().maximize();

        //i have to access a URL
        driver.get(TestConstants.JQUERYUI_URL);

        Actions actions = new Actions(driver);

        // understand the reason of failure
//        Actions actions = new Actions(driver);
//        WebElement dragWebElement = driver.findElement(By.id("draggable"));
//        WebElement dropWebElement = driver.findElement(By.id("droppable"));
//        actions
//                .clickAndHold(dragWebElement)
//                .moveToElement(dropWebElement)
//                .release()
//                .build().perform();
//
//        //solution - revisit function overloading again
        WebElement iframeElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

        driver.switchTo().frame(iframeElement);
//
        WebElement dragWebElement = driver.findElement(By.id("draggable"));
        WebElement dropWebElement = driver.findElement(By.id("droppable"));

        //way - 1
//        actions
//                .clickAndHold(dragWebElement)
//                .moveToElement(dropWebElement)
//                .release()
//                .build()
//                .perform();

        //way - 2
        actions
                .dragAndDrop(dragWebElement, dropWebElement)
                .perform();
//
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//a[text()='Resizable']")).click();
        driver.close();
    }

}
