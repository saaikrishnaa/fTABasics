package com.fta.handson.standalonetests.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmazonTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Desktop/sKA/courses/fTABasicsUSA/refer/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        String hamburgerMenu = "nav-hamburger-menu";

        driver.findElement(By.id(hamburgerMenu)).click();

        By mobilesAndComputers = By.xpath("//div[text()='Mobiles, Computers']/parent::a");

        driver.findElement(mobilesAndComputers).click();


        WebElement laptopsWebElement = driver.findElement(By.xpath("//a[text()='Laptops']"));

        laptopsWebElement.click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//span[text()='Apple']")).click();

        driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()='Price: High to Low']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-1']/div/div/div/span/a")).click();

//        driver.findElement(By.id(hamburgerMenu)).click();

        //To demonstrate findElements - Ignore for now, the Java List<> Collection and forEach loop, thats for later day discussion
        List<WebElement> elements = driver.findElements(By.xpath("//a"));

        int i = 0;
        //using forEach loop
//        for(WebElement element : elements){
//            System.out.println( (i++) + "->"+ element.getText());
//        }

//        using for loop
        for(;i<elements.size();i++){
            System.out.println(i+"->"+ elements.get(i).getText());
        }


        driver.close();
    }

}
