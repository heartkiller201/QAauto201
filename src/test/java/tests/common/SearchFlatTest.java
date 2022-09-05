package tests.common;


import common.Config;
import org.testng.annotations.Test;
import tests.base.BaseTest;


public class SearchFlatTest extends BaseTest {

    @Test
    public void checkIsRedirectToListing() {
        switchWindow();
        basePage.open(Config.HOME_PAGE);

        realtHomePage
                .enterCountRooms3()
                .clickFindButton();

        realtListingPage
                .checkCountCards();


    }


}
