package tests.common;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.util.List;
import java.util.Set;

public class CookieTest extends BaseTest {

    @Test
    public void workWithCookie() throws InterruptedException {

        driver.get("https://github.com/");
        Cookie getCookie = new Cookie("user_session","iISCJ6SQ21TtD6BhxfomixLdWjwaFZeyf9piq-LfmaNH-Lap");
        driver.manage().addCookie(getCookie);
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        Set<Cookie> ourCookie = driver.manage().getCookies();
        System.out.println("cookie====>" + ourCookie);



    }




}
