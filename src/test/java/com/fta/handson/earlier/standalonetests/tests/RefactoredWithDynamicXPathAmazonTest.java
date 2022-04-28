package com.fta.handson.earlier.standalonetests.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefactoredWithDynamicXPathAmazonTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Desktop/sKA/courses/fTABasicsUSA/refer/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        String hamburgerMenu = "nav-hamburger-menu";

        String oldXpath = "//*[text()='EXISTING_TEXT']";

//        driver.findElement(By.id(hamburgerMenu)).click(); // EARLIER
        click(driver, "id", hamburgerMenu); // WITH REUSABLE METHOD - 3

        By mobilesAndComputers = By.xpath("//div[text()='Mobiles, Computers']/parent::a");
//        driver.findElement(mobilesAndComputers).click(); // EARLIER
        click(driver, mobilesAndComputers); // WITH REUSABLE METHOD - 1

        WebElement laptopsWebElement = driver.findElement(By.xpath("//a[text()='Laptops']"));
//        laptopsWebElement.click(); // EARLIER
        click(laptopsWebElement); // WITH REUSABLE METHOD - 2


//        driver.findElement(By.xpath("//span[text()='Apple']")).click(); //EARLIER
//        click(driver, "xpath","//span[text()='Apple']"); // WITH REUSABLE METHOD - 3
        click(driver, "xpath", oldXpath.replace("EXISTING_TEXT","Apple")); //  WITH REUSABLE METHOD - 3 & DYNAMIC XPATH


//        driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
        click(driver, "xpath","//span[text()='Sort by:']"); // WITH REUSABLE METHOD - 3
//        click(driver, "xpath",oldXpath.replace("REPLACE_THIS","Sort by:")); //  WITH REUSABLE METHOD - 3 & DYNAMIC XPATH


//        driver.findElement(By.xpath("//a[text()='Price: High to Low']")).click();
//        click(driver, "xpath","//a[text()='Price: High to Low']"); // WITH REUSABLE METHOD - 3
        click(driver, "xpath", oldXpath.replace("EXISTING_TEXT","Price: High to Low"));


//        driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-1']/div/div/div/span/a")).click();
        click(driver, "xpath","//div[@cel_widget_id='MAIN-SEARCH_RESULTS-1']/div/div/div/span/a"); // WITH REUSABLE METHOD - 3

    }

//    REUSABLE METHOD - 1
   static void click(WebDriver driver, By by) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(by).click();
   }

    //    REUSABLE METHOD - 2
   static void click(WebElement webElement) throws InterruptedException{
        Thread.sleep(2000);
        webElement.click();
   }
   
   // REUSABLE METHOD - 3
    static void click(WebDriver driver, String locatorType, String locatorValue) throws InterruptedException{
        Thread.sleep(2000);
        if(locatorType.equalsIgnoreCase("xpath")){
            driver.findElement(By.xpath(locatorValue)).click();
        }else if (locatorType.equalsIgnoreCase("id")){
            driver.findElement(By.id(locatorValue)).click();
        }else if (locatorType.equalsIgnoreCase("linkText")){
            driver.findElement(By.linkText(locatorValue)).click();
        }else if (locatorType.equalsIgnoreCase("partialLinkText")){
            driver.findElement(By.partialLinkText(locatorValue)).click();
        }else{
            driver.findElement(By.className(locatorValue)).click();
        }
    }
}
