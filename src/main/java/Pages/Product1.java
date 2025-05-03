package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product1 {
    WebDriver driver;

    public Product1(WebDriver driver) {
        this.driver=driver;
    }
    private By addToCart = By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a");


    public  AlertsPages ClickOnAddtoCartButton() {
        driver.findElement(addToCart).click();
        return null;


    }
}
