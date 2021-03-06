package step_definitions.smartbear_stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.smartbear_pages.SmartBearLoginPage;
import utilities.Driver;

public class SmartBear_StepDefs {

    SmartBearLoginPage sbLoginPage = new SmartBearLoginPage();

    @When("User is on SmartBear login page")
    public void user_is_on_SmartBear_login_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @When("User enters correct username")
    public void user_enters_correct_username() {
        sbLoginPage.usernameBox.sendKeys("Tester");
    }

    @When("User enters correct password")
    public void user_enters_correct_password() {
        sbLoginPage.passwordBox.sendKeys("test");
    }

    @When("User clicks to login button")
    public void user_clicks_to_login_button() {
        sbLoginPage.loginBtn.click();
    }

    @Then("User should be logged in and be able to verify Welcome text is displayed")
    public void user_should_be_logged_in_and_be_able_to_verify_Welcome_text_is_displayed() {
        // instead of asserting welcome webelement we just assert the title
        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle = "Web Orders";

        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @When("User enters incorrect password")
    public void user_enters_incorrect_password() {
        sbLoginPage.passwordBox.sendKeys("wrongpassword");
    }

    @Then("User should see the error message displayed on the page")
    public void user_should_see_the_error_message_displayed_on_the_page() {
        Assert.assertTrue("Error message is not displayed! ",sbLoginPage.aboveBox.isDisplayed());
    }
}
