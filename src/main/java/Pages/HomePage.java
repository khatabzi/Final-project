package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public  HomePage(WebDriver driver) {
        this.driver = driver;
    }
        private By SignUpButton= By.xpath("/html/body/nav/div[1]/ul/li[8]/a");
        private By LoginButton = By.id("login2");
        private By CartButton = By.xpath("/html/body/nav/div[1]/ul/li[4]/a");



        public SignUpPage ClickSignUpButton(){
            driver.findElement(SignUpButton).click();
            return new SignUpPage(driver);
        }

        public LoginPage ClickOnLoginButton(){
            driver.findElement(LoginButton).click();
            return new  LoginPage(driver);
        }
        public CartPage ClickOnCartPage(){
            driver.findElement(CartButton).click();
            return new  CartPage(driver);
        }
}

