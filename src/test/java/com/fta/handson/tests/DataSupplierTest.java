package com.fta.handson.tests;

import com.fta.handson.pojo.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.testng.annotations.Test;

public class DataSupplierTest {

    @Test(dataProvider = "supply")
    public void dataSupplierTest(TestData testData){
        System.out.print(testData.testName+" "+testData.username+" "+testData.password);
        System.out.println();
    }

    @DataSupplier
    public StreamEx<TestData> supply(){
        return TestDataReader
                .use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource("testdata.xlsx")
                .read();
    }
}
