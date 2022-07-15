package tests.base;

import common.CommonAction;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import pages.base.BasePage;
import pages.listing.RealtListingPage;
import pages.realthome.RealtHomePage;

import java.time.Duration;
import java.util.Set;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected RealtListingPage realtListingPage = new RealtListingPage((driver));


    protected void switchWindow() {
        JavascriptExecutor js = (JavascriptExecutor) driver;     //определеяем JS executor

        String window1 = driver.getWindowHandle();               //забираем инфо хеша окна(вкладки)

        js.executeScript("window.open()");                  //открываем новую вкладку

        Set<String> currentWindows = driver.getWindowHandles();   //забираем все хеши вкладок в коллекцию

        String window2 = null;   //объявляем вторую вкладку

        for (String window : currentWindows) {                  //перебираем циклом все значения в коллекции и находим хэш второй вкладки
            if (!window.equals(window1)) {
                window2 = window;
                break;
            }
        }
        driver.switchTo().window(window2);                         //переключаемся на вторую вкладку

    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));    //работа с алертами
    protected void switchAlert() {

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        alert.accept();

    }

    @AfterSuite(alwaysRun = true)
    public void quite() {
        driver.quit();
    }


}
