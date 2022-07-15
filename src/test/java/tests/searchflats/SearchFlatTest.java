package tests.searchflats;


import org.testng.annotations.Test;
import tests.base.BaseTest;


public class SearchFlatTest extends BaseTest {

    @Test
    public void checkIsRedirectToListing() {
        switchWindow();
        basePage.open("https://realt.by");

        realtHomePage
                .enterCountRooms()
                .clickFindButton();
        realtListingPage
                .checkCountCards();


    }


}
