package tests;

import base.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseDriver {

    @Test
    public void validLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("bob@example.com", "10203040");

        System.out.println("Valid Login Test Executed");

        Assert.assertTrue(true);  // placeholder assertion
    }

    @Test
    public void invalidLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("wrong@example.com", "wrongpass");

        System.out.println("Invalid Login Test Executed");

        Assert.assertTrue(true);  // placeholder assertion
    }
}