package pages.realthome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class ProfilePage extends BasePage {


    public ProfilePage(WebDriver driver) {
        super(driver);
    }


    By emailInput = By.xpath("//input[@id='email']");


    public void openProfilePage() {
        driver.get("https://realt.by/account/profile/");
    }

    public void matchEmails(String email) {
        String emailActual = webElementIsVisible(driver.findElement(emailInput)).getAttribute("value");
        Assert.assertEquals(emailActual, email, "Email doesn't match");
        System.out.println(emailActual);
    }


}
