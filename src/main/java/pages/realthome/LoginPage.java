package pages.realthome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static common.Config.LOGIN_PAGE;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By currentAccountBt = By.xpath("//div[@class='mt-2.5 flex justify-center']//span[@class='flex items-center justify-center h-min']");
    By loginInput = By.xpath("//input[@name='login']");
    By proceedBt = By.xpath("//span[text()='Продолжить']");

    By passwordInput = By.xpath("//input[@name='pwd']");
    By loginBt = By.xpath("//span[text()='Войти']");



    public void openLoginPage() {
        driver.get(LOGIN_PAGE);
    }

    public LoginPage loginProcess() throws InterruptedException {
        webElementIsVisible(driver.findElement(loginInput));
        driver.findElement(loginInput).sendKeys("xvzrwyeiudjwf@knowledgemd.com");
        webElementIsVisible(driver.findElement(proceedBt)).click();
        Thread.sleep(2000);
        webElementIsVisible(driver.findElement(passwordInput)).sendKeys("Qazwsx123");
        webElementIsVisible(driver.findElement(loginBt)).submit();
        return this;
    }















}
