package tests.common;

import org.testng.annotations.Test;
import tests.base.BaseTest;



public class FlatSaleTest extends BaseTest {

    @Test
    public void errorMessageIsAppearedForUnverifiedPhone() throws InterruptedException {

        LoginTest login = new LoginTest();
        login.checkLoginIsSuccessful();
        basePage.openHomePage();
        realtHomePage.addFlatForSale();
        flatSalePage.inputNotVerifiedPhone();






    }




}
