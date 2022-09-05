package tests.common;

import common.Config;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void checkLoginIsSuccessful() throws InterruptedException {

        loginPage.openLoginPage();
        loginPage.inputLogin(Config.LOGIN);
        loginPage.proceedBtClick();
        Thread.sleep(2000);
        loginPage.inputPassword(Config.PASSWORD);
        loginPage.loginBtClick();
        Thread.sleep(2000);

        driver.getCurrentUrl().equals(Config.HOME_PAGE);

        profilePage.openProfilePage();
        profilePage.matchEmails(Config.LOGIN);


    }


}
