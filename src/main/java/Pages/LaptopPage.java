package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaptopPage {
    WebDriver driver;
    public LaptopPage(WebDriver driver) {
        this.driver=driver;
    }
    private By MacbookAir = By.xpath("/html/body/div[5]/div/div[2]/div/div[3]/div/div/h4/a");
    private By SonyVaioi5 = By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a");


    public Product1 ClickonMacbookAir(){
        driver.findElement(MacbookAir).click();
        return new Product1(driver);
    }
    public  Product2 ClickOnSonyVaioi5(){
        driver.findElement(SonyVaioi5).click();
        return new Product2(driver);
    }
}
