package com.fta.handson.testng.browsercustomization;

import com.fta.handson.selenium.pages.OrangeHRMLoginDashboardPage;
import com.fta.handson.selenium.pages.OrangeHRMLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.List;

import static com.fta.handson.selenium.pages.OrangeHRMRecruitmentPage.slt_jobTitle;
import static com.fta.handson.selenium.pages.OrangeHRMRecruitmentPage.slt_vacancy;

public class BrowserCustomization {

    public static String URL = "https://opensource-demo.orangehrmlive.com/";
    WebDriver driver;

    @Test
    public void orangeHRM_incognitoModeLoginTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");

        driver = new ChromeDriver(chromeOptions);

//        driver.manage().window().maximize();
        driver.get(URL);
        inputValues(driver, OrangeHRMLoginPage.txt_username, "Admin");
        inputValues(driver, OrangeHRMLoginPage.txt_password, "admin123");
        click(driver, OrangeHRMLoginPage.btn_login);

        driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
    }

    @Test
    public void orangeHRM_multipleOptionsTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito", "--headless", "--start-minimized", "--disable-notifications");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(URL);
        inputValues(driver, OrangeHRMLoginPage.txt_username, "Admin");
        inputValues(driver, OrangeHRMLoginPage.txt_password, "admin123");
        click(driver, OrangeHRMLoginPage.btn_login);

        click(driver, OrangeHRMLoginDashboardPage.lnk_recruitment);
        Thread.sleep(2000);

//        getListOfVacancies(driver, slt_vacancy);
        getListOfJobTitles(driver, slt_jobTitle);

        driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
    }

    @Test(enabled = false)
    public void orangeHRM_proxyServerTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito", "--headless", "--start-minimized", "--disable-notifications");

        // Add the WebDriver proxy capability.
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("myhttpproxy:3337");
        chromeOptions.setCapability("proxy", proxy);

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(URL);
        inputValues(driver, OrangeHRMLoginPage.txt_username, "Admin");
        inputValues(driver, OrangeHRMLoginPage.txt_password, "admin123");
        click(driver, OrangeHRMLoginPage.btn_login);

        click(driver, OrangeHRMLoginDashboardPage.lnk_recruitment);
        Thread.sleep(2000);

        getListOfVacancies(driver, slt_vacancy);

        driver.findElement(By.xpath("//a[contains(@href,'#')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
    }

    @AfterMethod
    public void tearDown() {
        //To close the browser instance
        driver.close();
    }

    public static void click(WebDriver driver, By by) {
        explicitlyWait(driver, by);
        driver.findElement(by).click();
    }

    public static void inputValues(WebDriver driver, By by, String inputText) {
        explicitlyWait(driver, by);
        driver.findElement(by).sendKeys(inputText);
    }

    public static void selectDropDownByText(WebDriver driver, By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    private static void selectByDropDownValue(WebDriver driver, By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    private static void selectByDropDownIndex(WebDriver driver, By by, Integer index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    private void getListOfVacancies(WebDriver driver, By by) {
        Select select = new Select(driver.findElement(by));
        List<WebElement> vacancies = select.getOptions();

        //Enhanced for loop
//        for(WebElement element : vacancies){
//            System.out.println(element.getText());
//        }
        //Normal for loop
        for (int i = 0; i < vacancies.size(); i++) {
            System.out.println(vacancies.get(i).getText());
        }
    }

    private void getListOfJobTitles(WebDriver driver, By by) {
        Select select = new Select(driver.findElement(by));
        List<WebElement> jobTitlesList = select.getOptions();
        for (int i = 0; i < jobTitlesList.size(); i++) {
            System.out.println(jobTitlesList.get(i).getText());
        }
    }

    public static void explicitlyWait(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        if (by.equals(OrangeHRMLoginPage.txt_username)) {
            wait.until(ExpectedConditions.presenceOfElementLocated(OrangeHRMLoginPage.txt_username));
        } else if (by.equals(OrangeHRMLoginPage.txt_password)) {
            wait.until(ExpectedConditions.presenceOfElementLocated(OrangeHRMLoginPage.txt_password));
        } else if (by.equals(OrangeHRMLoginPage.btn_login)) {
            wait.until(ExpectedConditions.presenceOfElementLocated(OrangeHRMLoginPage.btn_login));
        } else if (by.equals(OrangeHRMLoginDashboardPage.lnk_recruitment)) {
            wait.until(ExpectedConditions.presenceOfElementLocated(OrangeHRMLoginDashboardPage.lnk_recruitment));
        } else if (by.equals(slt_vacancy)) {
            wait.until(ExpectedConditions.presenceOfElementLocated(slt_vacancy));
        } else {
            wait.until(ExpectedConditions.presenceOfElementLocated(slt_jobTitle));
        }
    }
}
