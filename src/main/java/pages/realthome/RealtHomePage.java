package pages.realthome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {


    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    By countRooms = By.xpath("//select[@id='rooms']");
    By option3rooms = By.xpath("//select[@id='rooms']/option[@value = '3']");
    By findBt = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    public RealtHomePage enterCountRooms() {
        driver.findElement(countRooms).click();
        driver.findElement(option3rooms).click();
        return this;
    }

    public RealtHomePage clickFindButton() {
        driver.findElement(findBt).click();
        return this;
    }


}
