package tests.searchflats;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class EuroCurrencyTest extends BaseTest {

    @Test
    public void checkEuroCurrencyIsChosen () {
        basePage.openHomePage();
        realtHomePage.chooseEuro();


    }
}
