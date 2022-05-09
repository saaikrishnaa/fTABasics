package com.fta.handson.tests;

import com.fta.handson.annotations.FrameworkAnnotation;
import com.fta.handson.pages.LoginPage;
import com.fta.handson.utils.ExcelUtils;
import org.testng.annotations.Test;

import java.util.Map;

public class SauceDemoUserLoginDataProviderTest extends BaseTest {

    @Test(description = "Logging saucedemo application using proper credentials - excel-data-provider-apache-poi", dataProviderClass = ExcelUtils.class, dataProvider = "cred-data")
    @FrameworkAnnotation(authorName = "excel-data-provider-apache-poi",category = "Regression",devices = "Tablet")
    public void sauceDemoLoginTest(Map<String, String> credentials) throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToSauceDemoApplication(credentials.get("username"), credentials.get("password"));
    }

}
