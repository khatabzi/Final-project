package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Data {
    WebDriver driver;

    public Data(WebDriver driver) {
        this.driver = driver;
    }

    private By NameBox = By.id("name");
    private By CountryBox = By.id("country");
    private By CityBox = By.id("city");
    private By CreditCardBox = By.id("card");
    private By MonthBox = By.id("month");
    private By YearBox = By.id("year");
    private By Purchase = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    private By Ok = By.xpath("/html/body/div[10]/div[7]/div/button");
    private By ValidationPurchase = By.xpath("/html/body/div[10]/h2");
    private By Purchase2 = By.xpath("/html/body");
    private By OK2 = By.xpath("/html/body/div[10]/div[7]/div/button");


    public void InsertName(String name) {
        driver.findElement(NameBox).sendKeys(name);
    }

    public void InsertCountry(String country) {
        driver.findElement(CountryBox).sendKeys(country);
    }

    public void InsertCity(String city) {
        driver.findElement(CityBox).sendKeys(city);
    }

    public void InsertCredit(String credit) {
        driver.findElement(CreditCardBox).sendKeys(credit);
    }

    public void InsertMonth(String month) {
        driver.findElement(MonthBox).sendKeys(month);
    }

    public void InsertYear(String year) {
        driver.findElement(YearBox).sendKeys(year);
    }

    public void ClickOnPurchaseButton() {
        driver.findElement(Purchase).click();
    }

    public void ClickOnOkButton() {
        driver.findElement(Ok).click();
    }

    public void ClickOnPurchaseButton2() {
        driver.findElement(Purchase2).click();

    }
    public void ClickOnOk2(){
        driver.findElement(OK2).click();
    }
}


