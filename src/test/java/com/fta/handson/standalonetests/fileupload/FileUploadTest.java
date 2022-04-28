package com.fta.handson.standalonetests.fileupload;


import com.fta.handson.selenium.config.TestConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUploadTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //now we have maximized the browser window
        driver.manage().window().maximize();

        //i have to access a URL
        driver.get(TestConstants.FILEUPLOAD_URL);

        WebElement fileUpload = driver.findElement(By.id("uploadfile_0"));
        fileUpload.sendKeys(System.getProperty("user.dir")+"/src/test/resources/File_To_Upload.txt");

        driver.findElement(By.xpath("//input[@id='terms']")).click();
        
        driver.findElement(By.xpath("//button[@name='send']")).click();

        Thread.sleep(5000);

        driver.close();
    }

}
