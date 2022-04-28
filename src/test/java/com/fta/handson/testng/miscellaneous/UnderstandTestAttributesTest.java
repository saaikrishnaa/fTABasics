package com.fta.handson.testng.miscellaneous;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UnderstandTestAttributesTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("<<<<<<<<<<<<<<<<<<<< I will execute BEFORE every automated test");
    }


    @Test(dependsOnGroups = {"frequent"})
    public void aTest() throws InterruptedException {
        System.out.println("I am dependent on the registration test logic");
    }

    @Test(groups = {"regression", "sanity"})
    public void teslaRegistrationTest() throws InterruptedException {
        System.out.println("teslaRegistrationTest");
    }

    @Test(groups = {"regression", "frequent"})
    public void teslaAutoPilotTest() throws InterruptedException {
        System.out.println("teslaAutoPilotTest");
    }

    @Test(groups = {"smoke", "sanity"})
    public void teslaDomianTest() throws InterruptedException {
        System.out.println("teslaDomianTest");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("I will execute AFTER every automated test >>>>>>>>>>>>>>>>>>");
    }
}
