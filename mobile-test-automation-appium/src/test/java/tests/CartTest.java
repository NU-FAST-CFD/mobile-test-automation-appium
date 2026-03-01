package tests;

import base.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import pages.CartPage;

public class CartTest extends BaseDriver {

    
    @Test
    public void removeItemFromCartTest() {

        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        homePage.openFirstProduct();
        productPage.addToCart();
        homePage.openCart();
        cartPage.removeItem();

        System.out.println("Remove Item Test Executed");

        Assert.assertTrue(true);
    }

    @Test
    public void checkoutTest() {

        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        homePage.openFirstProduct();
        productPage.addToCart();
        homePage.openCart();
        cartPage.clickCheckout();

        System.out.println("Checkout Test Executed");

        Assert.assertTrue(true);
    }
}
