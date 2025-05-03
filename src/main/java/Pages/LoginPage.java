package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    private By UserNameBox = By.id("loginusername");
    private By PasswordBox = By.id("loginpassword");
    private By LoginButton = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");



    public void InsertUserName(String username) {
        driver.findElement(UserNameBox).sendKeys(username);
    }
    public void InsertPassword(String Password){
        driver.findElement(PasswordBox).sendKeys(Password);
    }
    public MyAccountPage ClickOnLoginButton(){
        driver.findElement(LoginButton).click();
        return new  MyAccountPage(driver);
    }
    


}
