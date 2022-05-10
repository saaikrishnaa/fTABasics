package com.fta.handson.tests;

import com.fta.handson.annotations.FrameworkAnnotation;
import com.fta.handson.pages.LoginPage;
import com.fta.handson.pojo.TestDataExcel;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.testng.annotations.Test;

public class SauceDemoUserLoginWithExcelDataSupplierTest extends BaseTest {

    @Test(description = "Logging saucedemo application using proper credentials - test-data-provider-excel", dataProvider = "supply")
    @FrameworkAnnotation(authorName = "test-data-provider-excel", category = "Sanity", devices = "Mac")
    public void sauceDemoLoginTest(TestDataExcel testDataExcel) throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToSauceDemoApplication(testDataExcel.username, testDataExcel.password);
    }

    @DataSupplier
    public StreamEx<TestDataExcel> supply() {
        return TestDataReader
                .use(XlsxReader.class)
                .withTarget(TestDataExcel.class)
                .withSource("testdata.xlsx")
                .read()
                .filter(testData -> testData.testName.equalsIgnoreCase("sauceDemoLoginTest"));
    }

}
