package TestCases;

import Base.BaseSteps;
import Pages.SignUpPage;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class InvalidSignUp extends BaseSteps {
    SignUpPage signUpPage;

    @Test
    public void InvalidSignUp() throws InterruptedException {
        signUpPage = homePage.ClickSignUpButton();
        Thread.sleep(1000);
        signUpPage.InsertUserName("mahmoudz");
        signUpPage.InsertPassword("561561");
        signUpPage.ClickOnSignupBlueButton();


        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert message: " + alertText);
        alert.accept();
    }

}
