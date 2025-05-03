package Base;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseSteps {
    public WebDriver driver;
    public HomePage homePage;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);


        GoHome();
    }

    public void GoHome() {
        driver.get("https://www.demoblaze.com/");
    }

    //@AfterClass
    //public void close() {
        //driver.quit();  // Close the browser after tests
    //}
}
