package pages.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;

import java.time.Duration;

public class AllegroHomePage extends BasePage {


    public AllegroHomePage(WebDriver driver) {
        super(driver);
    }

    private final By acceptCookieBt = By.xpath("//button[text()='Ok, zgadzam się']");
    private final By changeLanguageBt = By.xpath("//a[@data-analytics-click-label='ShippingCountryFlag']");

    private final By languageBt = By.xpath("//select[@id='language-select']");
    private final By enLocale = By.xpath("//select[@id='language-select']/option[2]");
    private final By submitLocaleBt = By.xpath("//form/button[@type='submit' and text()='Zmień']");

    private final By myAllegroBt = By.xpath("//div[@class = 'eut9m mp7g_q5']/button[@data-role = 'header-dropdown-toggle']");
    private final By signInBt = By.xpath("//a[@data-role = 'auth-button' and text()='Sign in']");
    private final By accountBt = By.id("user-menu-heading2");

    private final By emailString = By.xpath("//div[@class = 'mpof_ki m7f5_sf']//h6[@data-role = 'user-card-email']");

    private final By searchBt = By.xpath("//button[@data-role = 'search-button']");


    public void deleteCookies() {
        driver.navigate().refresh();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }
    public void acceptCookie() {
            if (driver.findElements(acceptCookieBt).size() == 1) {
            driver.findElement(acceptCookieBt).click();
        }
    }

    public void changeLanguage() throws InterruptedException {
        String cat = driver.findElement(searchBt).getAttribute("textContent");
        if (!cat.equals("search")) {
            driver.findElement(changeLanguageBt).click();
            driver.findElement(languageBt).click();
            driver.findElement(enLocale).click();
            driver.findElement(submitLocaleBt).click();
            Thread.sleep(2000);
        }

    }


    public void goToLogin() throws InterruptedException {
        Thread.sleep(3000);
        webElementIsVisible(driver.findElement(myAllegroBt)).click();
        driver.findElement(signInBt).click();
    }


    public void goToMyAccount() {
        webElementIsVisible(driver.findElement(myAllegroBt)).click();
        driver.findElement(accountBt).click();
    }

    public void verifyEmail(String email) {
        String ourEmail = driver.findElement(emailString).getAttribute("title");
        Assert.assertEquals(ourEmail, email, "emails don't match");
    }


}
