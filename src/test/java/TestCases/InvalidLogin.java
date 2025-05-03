package TestCases;

import Base.BaseSteps;
import Pages.LoginPage;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseSteps {
    LoginPage loginPage;

    @Test
    public void InvalidLogin() throws InterruptedException {
        Thread.sleep(1000);
        loginPage = homePage.ClickOnLoginButton();
        Thread.sleep(1000);


        loginPage.InsertUserName("ddasas");
        loginPage.InsertPassword("cdcd");
        loginPage.ClickOnLoginButton();
        Thread.sleep(1000);


        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert message: " + alertText);
        alert.accept();
    }
}
