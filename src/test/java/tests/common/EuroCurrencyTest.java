package tests.common;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class EuroCurrencyTest extends BaseTest {

    @Test(description = "Euro")
    public void checkEuroCurrencyIsChosen() {
        basePage.openHomePage();
        realtHomePage.chooseEuro();


    }
}
