package pages.realthome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.base.BasePage;


public class RealtHomePage extends BasePage {


    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    By countRooms = By.xpath("//select[@id='rooms']");
    By option3rooms = By.xpath("//select[@id='rooms']/option[@value = '3']");
    By findBt = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    By listCurrency = By.xpath("//a[@class='btn btn-sm']");
    By euro = By.xpath("//a[@data-currency='978']");


    public RealtHomePage enterCountRooms3() {
        driver.findElement(countRooms).click();
        driver.findElement(option3rooms).click();
        return this;
    }

    public RealtHomePage clickFindButton() {
        driver.findElement(findBt).click();
        return this;
    }

    public void chooseEuro() {
        driver.findElement(listCurrency).click();
        driver.findElement(euro).click();
        String euroClass = driver.findElement(euro).getAttribute("class");
        Assert.assertEquals(euroClass, "list-group-item color-primary");
        System.out.println(euroClass);
    }


}
