package tests.searchflats;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void checkLoginIsSuccessful() throws InterruptedException {
        loginPage.openLoginPage();
        loginPage.loginProcess();
        realtHomePage.userIsInSystem();

    }


}
