package pages.realthome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class FlatSalePage extends BasePage {

    public FlatSalePage(WebDriver driver) {
        super(driver);
    }

    By phoneNumberOne = By.xpath("//input[@type='tel']");
    By contactName = By.xpath("//input[@id='contacts.name']");

    By numberIsNotVerifiedError = By.xpath("//div[@class='text-danger-500 pt-1.5 text-subhead']");


    public FlatSalePage inputNotVerifiedPhone() {
        driver.findElement(phoneNumberOne).sendKeys("111111111");
        driver.findElement(contactName).sendKeys("Vlad");
        webElementIsVisible(driver.findElement(numberIsNotVerifiedError));
        return this;
    }


}
