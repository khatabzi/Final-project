package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPages {
    WebDriver driver;
    public AlertsPages(WebDriver driver) {
        this.driver = driver;
    }
    public void AcceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void dissmisAlert(){
        driver.switchTo().alert().dismiss();
    }
}
