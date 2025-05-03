package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    WebDriver driver;
    public MyAccountPage(WebDriver driver) {
    this.driver=driver;
    }
    private By ValidatLogin =By.xpath("/html/body/nav/div[1]/ul/li[7]/a");
    private By LaptopButton = By.xpath("/html/body/div[5]/div/div[1]/div/a[3]");

    public String GetSuccessLogin(){
        String Success =driver.findElement(ValidatLogin).getText();
        return Success;
    }
    public LaptopPage ClickOnLaptopButton(){
        driver.findElement(LaptopButton).click();
        return new  LaptopPage(driver);
    }
}
