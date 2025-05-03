package TestCases;

import Base.BaseSteps;
import Pages.AlertsPages;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignUpPage;
import org.testng.annotations.Test;

public class SignUp extends BaseSteps {
    SignUpPage signUpPage;
    AlertsPages alertsPages;



    @Test
    public void ValidSignUp() throws InterruptedException {
        signUpPage=homePage.ClickSignUpButton();
        Thread.sleep(1000);
        signUpPage.InsertUserName("mahmoudzz");
        signUpPage.InsertPassword("5615611");
        alertsPages =signUpPage.ClickOnSignupBlueButton();
        Thread.sleep(1000);
        alertsPages.AcceptAlert();



    }
}
