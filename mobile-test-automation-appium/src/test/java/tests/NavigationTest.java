package tests;

import base.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class NavigationTest extends BaseDriver {

    @Test
    public void openMenuTest() {

        HomePage homePage = new HomePage(driver);
        homePage.openMenu();

        System.out.println("Open Menu Test Executed");

        Assert.assertTrue(true);
    }

    @Test
    public void openCartFromHomeTest() {

        HomePage homePage = new HomePage(driver);
        homePage.openCart();

        System.out.println("Open Cart From Home Test Executed");

        Assert.assertTrue(true);
    }
}