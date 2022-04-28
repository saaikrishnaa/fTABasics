package com.fta.handson.earlier.testng.earlier.dataprovider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RefactorExcelDataProviderTest {

    WebDriver driver;

    @DataProvider
    public static Object[][] credentialsProvider() throws IOException {
        //Load the .xlsx file
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir").concat("/src/test/resources/data/user-login.xlsx"));

        //Use the Apache POI library classes to interact with .xlsx file
        //Instantiate XSSFWorkbook to do read and write tasks with the excel workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //Instantiate XSSFSheet to perform read and write tasks with an excel sheet
        XSSFSheet sheet = workbook.getSheet("login-credentials");

        //Iterate over the data, which is in rows and columns in the excel sheet
        //To do that, we need to know how many rows are there, and how many columns are there
        int rows = sheet.getLastRowNum();
        int columns = sheet.getRow(0).getLastCellNum();

//        Object[][] creds = new Object[rows][columns]; //earlier
        Object[][] creds = new Object[rows][1]; //now - as we have 4 rows but a single column, which is a map of values

        Map<String, String> credMap ;

        //Now, get the number of rows and number of columns
        for (int i = 1; i <= rows; i++) {
            credMap = new HashMap<>(); // For every new row, a map object will be created
            for (int j = 0; j < columns; j++) {
//                creds[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue(); //earlier
                credMap.put(
                        sheet.getRow(0).getCell(j).getStringCellValue(),
                        sheet.getRow(i).getCell(j).getStringCellValue()
                ); //now
            }
            //Now load the map into the Object[][]
            creds[i-1][0] = credMap;
        }
        return creds;
    }

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //now we have maximized the browser window
        driver.manage().window().maximize();
    }

    @Test(description = "To test the login functionality in Sauce Labs application", dataProvider = "credentialsProvider")
    public void sauceLabsLoginTest(Map<String, String> credentialsMap) throws InterruptedException {

        //To launch a URL
        driver.get("https://www.saucedemo.com/");

        //To maximize the window / Fullscreen
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(credentialsMap.get("username"));
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(credentialsMap.get("password"));
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
//
//        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
    }


    @AfterMethod
    public void tearDown() {
        //To close the browser instance
        driver.close();
    }
}
