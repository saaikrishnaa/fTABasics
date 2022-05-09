package com.fta.handson.tests;

import com.fta.handson.annotations.FrameworkAnnotation;
import com.fta.handson.pages.LoginPage;
import com.fta.handson.pojo.TestDataJSON;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.JsonReader;
import io.github.sskorol.data.TestDataReader;
import one.util.streamex.StreamEx;
import org.testng.annotations.Test;

public class SauceDemoUserLoginWithJSONDataSupplierTest extends BaseTest {

    @Test(description = "Logging saucedemo application using proper credentials - test-data-provider-json", dataProvider = "supply")
    @FrameworkAnnotation(authorName = "test-data-provider-json", category = "Smoke", devices = "Desktop")
    public void sauceDemoLoginTest(TestDataJSON testDataJSON) throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToSauceDemoApplication(testDataJSON.username, testDataJSON.password);
    }

    @DataSupplier
    public StreamEx<TestDataJSON> supply() {
        return TestDataReader
                .use(JsonReader.class)
                .withTarget(TestDataJSON.class)
                .withSource("testdata.json")
                .read()
                .filter(testdata -> testdata.testcasename.equalsIgnoreCase("sauceDemoLoginTest"));
    }

}
