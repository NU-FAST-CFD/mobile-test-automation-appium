package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ProductPage {

    private AndroidDriver driver;

    public ProductPage(AndroidDriver driver) {
        this.driver = driver;
    }

    
    private By addToCartButton = By.id("com.saucelabs.mydemoapp.android:id/cartBt");
    private By backButton = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void goBack() {
        driver.findElement(backButton).click();
    }
}
