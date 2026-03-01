package tests;

import base.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;

public class ProductTest extends BaseDriver {

    @Test
    public void openProductTest() {

        HomePage homePage = new HomePage(driver);
        homePage.openFirstProduct();

        System.out.println("Open Product Test Executed");

        Assert.assertTrue(true);
    }

    @Test
    public void addToCartTest() {

        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);

        homePage.openFirstProduct();
        productPage.addToCart();

        System.out.println("Add To Cart Test Executed");

        Assert.assertTrue(true);
    }
}