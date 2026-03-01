package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CartPage {

    private AndroidDriver driver;

    public CartPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By checkoutButton = By.id("com.saucelabs.mydemoapp.android:id/cartBt");
    private By removeButton = By.id("com.saucelabs.mydemoapp.android:id/removeBt");

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }

    public void removeItem() {
        driver.findElement(removeButton).click();
    }
}