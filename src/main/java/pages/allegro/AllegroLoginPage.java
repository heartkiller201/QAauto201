package pages.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class AllegroLoginPage extends BasePage {


    public AllegroLoginPage(WebDriver driver) {
        super(driver);
    }

    private final By emailInput = By.xpath("//input[@name = 'login']");

    private final By passwordInput = By.xpath("//input[@name = 'password']");

    private final By signInBt = By.xpath("//button[@class = 'm7er_k4 mp4t_24 bz58c bl8ld']");

    private final By skipMobileBt = By.id("skip-confirmation-btn");
    private final By incorrectEmailOrPasswordError = By.xpath("//div[@id = 'login-form-submit-error']");

    private final By blankEmailError = By.xpath("//div[@id = 'login-error']");

    public void inputEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void submitLogin() {
        driver.findElement(signInBt).submit();
    }

    public void skipMobile() {
        webElementIsVisible(driver.findElement(skipMobileBt)).click();
    }

    public void errorIsPresent(String error) {

        String ourError = driver.findElement(incorrectEmailOrPasswordError).getAttribute("textContent");
        Assert.assertEquals(ourError, error);
    }

    public void blankEmailErrorIsPresent(String error) {
        String ourError = driver.findElement(blankEmailError).getAttribute("textContent");
        Assert.assertEquals(ourError, error);
    }


}
