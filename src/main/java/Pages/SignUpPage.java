package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage  {
    WebDriver driver;
    public SignUpPage(WebDriver driver) {
        this.driver=driver;
    }

    private By userNameBox = By.id("sign-username");
    private By passwordBox = By.id("sign-password");
    private By signUpBlueButton = By.xpath("/html/body/div[2]/div/div/div[3]/button[2]");


    public void  InsertUserName(String username){
        driver.findElement(userNameBox).sendKeys(username);

    }
    public void InsertPassword(String password){

        driver.findElement(passwordBox).sendKeys(password);
    }


    public AlertsPages ClickOnSignupBlueButton(){
        driver.findElement(signUpBlueButton).click();
        return new  AlertsPages(driver);


    }
}
