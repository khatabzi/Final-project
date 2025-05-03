package TestCases;

import Base.BaseSteps;
import Pages.*;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Pages.TestListener.class)
public class Senario2 extends BaseSteps {

    CartPage cartPage = new CartPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    MyAccountPage myAccountPage = new MyAccountPage(driver);
    LaptopPage laptopPage = new LaptopPage(driver);
    Product1 product1 = new Product1(driver);
    Product2 product2 = new Product2(driver);
    Data data = new Data(driver);

    @Test
    public void Purchase() throws InterruptedException {
        Thread.sleep(3000);

        loginPage = homePage.ClickOnLoginButton();
        Thread.sleep(1000);

        loginPage.InsertUserName("mahmoudz");
        loginPage.InsertPassword("561561");

        myAccountPage = loginPage.ClickOnLoginButton();
        Thread.sleep(2000);

        String actualResult = myAccountPage.GetSuccessLogin();
        String expectedResult = "Welcome mahmoudz";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Thread.sleep(5000);

        laptopPage = myAccountPage.ClickOnLaptopButton();
        Thread.sleep(1000);

        product1 = laptopPage.ClickonMacbookAir();
        Thread.sleep(2000);

        product1.ClickOnAddtoCartButton();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        GoHome();
        cartPage = homePage.ClickOnCartPage();
        Thread.sleep(2000);
        String ActualResult2 = cartPage.CheckCartProducts();
        String expectedResult2 = "MacBook air";
        Assert.assertTrue(ActualResult2.contains(expectedResult2));
        GoHome();
        laptopPage = myAccountPage.ClickOnLaptopButton();
        Thread.sleep(1000);
        product2 = laptopPage.ClickOnSonyVaioi5();
        Thread.sleep(1000);
        product2.ClickOnAddtoCartButton();
        Thread.sleep(1000);
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        GoHome();
        cartPage = homePage.ClickOnCartPage();
        Thread.sleep(3000);
        String ActualResult3 = cartPage.CheckCartProducts2();
        String expectedResult3 = "Sony vaio i5";
        Thread.sleep(1000);
        Assert.assertTrue(ActualResult3.contains(expectedResult3));
        Thread.sleep(1000);
        String ActualResult4 = cartPage.ChickOrderAmount();
        String expectedResult4 = "1490";
        Assert.assertTrue(ActualResult4.contains(expectedResult4));
        data = cartPage.ClickOnPlaceOrderButton();
        Thread.sleep(2000);
        data.InsertName("Mahmoud");
        data.InsertCountry("Egypt");
        data.InsertCity("Cairo");
        data.InsertCredit("561851515615");
        data.InsertMonth("07");
        data.InsertYear("2000");
        data.ClickOnPurchaseButton();
        data.ClickOnOkButton();
    }
}
