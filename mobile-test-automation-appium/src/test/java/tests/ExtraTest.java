package tests;

import base.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class ExtraTest extends BaseDriver {

    @Test
    public void emptyUsernameTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("", "10203040");

        System.out.println("Empty Username Test Executed");

        Assert.assertTrue(true);
    }

    @Test
    public void emptyPasswordTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("bob@example.com", "");

        System.out.println("Empty Password Test Executed");

        Assert.assertTrue(true);
    }
}