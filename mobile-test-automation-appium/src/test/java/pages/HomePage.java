package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage {

    private AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    
    private By firstProduct = By.xpath("(//android.widget.ImageView)[1]");
    private By cartIcon = By.id("com.saucelabs.mydemoapp.android:id/cartIV");
    private By menuButton = By.id("com.saucelabs.mydemoapp.android:id/menuIV");

    public void openFirstProduct() {
        driver.findElement(firstProduct).click();
    }

    public void openCart() {
        driver.findElement(cartIcon).click();
    }

    public void openMenu() {
        driver.findElement(menuButton).click();
    }
}
