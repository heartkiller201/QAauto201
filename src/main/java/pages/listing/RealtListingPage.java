package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import pages.base.BasePage;
import pages.realthome.RealtHomePage;

public class RealtListingPage extends BasePage {
    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@class='listing view-format']//div[@data-mode='3']");

    public RealtListingPage checkCountCards() {
        webElementIsVisible(driver.findElement(card));
        int countCard = driver.findElements(card).size();
        Assertion assertation = new Assertion();
        assertation.assertEquals(countCard, 20); //сравниваем
        //можно использовать как альтернативу верхним двум >>>>>> Assert.assertEquals(countCard, 20);
        return this;
    }


}

