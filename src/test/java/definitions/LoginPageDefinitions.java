package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.base.BaseTest;

public class LoginPageDefinitions extends BaseTest {

    @Given("User is on Allegro home page {string}")
    public void loginTest(String url) {
        basePage.open(url);
    }

    @When("User enters email {string} and password {string}")
    public void loginProcess(String email, String password) throws InterruptedException {
        allegroHomePage.deleteCookies();
        allegroHomePage.acceptCookie();
        allegroHomePage.changeLanguage();
        allegroHomePage.goToLogin();
        allegroLoginPage.inputEmail(email);
        allegroLoginPage.inputPassword(password);
        allegroLoginPage.submitLogin();

    }

    @Then("User is taken to home page and should be able to login successfully with {string}")
    public void verifyLogin(String email) {
        allegroLoginPage.skipMobile();
        allegroHomePage.goToMyAccount();
        allegroHomePage.verifyEmail(email);
    }

    @Then("User should be able to see error message {string}")
    public void verifyErrorMessage(String error) {
        allegroLoginPage.errorIsPresent(error);
    }

    @Then("User should be able to see error message {string} under the blank field")
    public void verifyBlankEmail(String error) {
        allegroLoginPage.blankEmailErrorIsPresent(error);
    }


}
