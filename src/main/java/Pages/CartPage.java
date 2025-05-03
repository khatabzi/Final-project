package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver=driver;
    }
    private By CartProduct = By.cssSelector("#tbodyid > tr:nth-child(1) > td:nth-child(2)");
    private By CartProduct2 = By.cssSelector("#tbodyid > tr:nth-child(1) > td:nth-child(2)");
    private By PlaceOrder    = By.xpath("/html/body/div[6]/div/div[2]/button");


    public String CheckCartProducts(){
        String P1 = driver.findElement(CartProduct).getText();
        return P1;
    }
    public String CheckCartProducts2() {
        String P2 = driver.findElement(CartProduct).getText();

        return P2;


    }
    public Data ClickOnPlaceOrderButton(){
        driver.findElement(PlaceOrder).click();
        return new Data(driver);
    }
    public String ChickOrderAmount(){
       String Amount  = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/h3")).getText();
       return Amount;
    }
}
