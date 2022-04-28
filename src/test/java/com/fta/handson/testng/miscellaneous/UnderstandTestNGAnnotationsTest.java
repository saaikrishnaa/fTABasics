package com.fta.handson.testng.miscellaneous;

import org.testng.annotations.*;

public class UnderstandTestNGAnnotationsTest {

    //ORDER - Suite > Test > Class > Method > testCase
    /*
    * Suite
    *   -> Test
    *       -> Class
    *       -> Class
    *   -> Test
    *       -> Class
    *       -> Class
    *
    * */

    //Suite is a collection of multiple tests
    @BeforeSuite //To Create database connection, To initialize reports - Essentially, those tasks that have to be performed once for the entire test suite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @BeforeTest // Test is a collection of multiple classes - WE DON'T USE THIS AT WORK
    public void beforeTest(){
        System.out.println("Before Test >>>>>");
    }

    @BeforeClass // - WE DON'T USE THIS AT WORK
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod //I will execute before executing a Test
    public void setUp(){
        System.out.println("Before Method");
    }

    @Test(description = "FIRST") // This is what your automated test case refer to
    public void firstTest(){
        System.out.println("First Test");
    }

    @Test(enabled = true, description = "SECOND")
    public void secondTest(){
        System.out.println("Second Test");
    }

    @AfterMethod //I will execute after executing a Test
    public void tearDown(){
        System.out.println("After Method");
    }

    @AfterClass //- WE DON'T USE THIS AT WORK
    public void afterClass(){
        System.out.println("After Class");
    }

    @AfterTest //   - WE DON'T USE THIS AT WORK
    public void afterTest(){
        System.out.println("After Test <<<<");
    }

    @AfterSuite // To close the database connection, To close the reports, etc
    public void afterSuite(){
        System.out.println("After Suite");
    }
}
