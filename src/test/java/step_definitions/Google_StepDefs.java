package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.google_pages.GoogleLandingPage;
import utilities.Driver;
import utilities.log;

public class Google_StepDefs {

    GoogleLandingPage googleLandingPage = new GoogleLandingPage();

    @When("User is on google homepage")
    public void user_is_on_google_homepage() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();

        //1-get the google page
        Driver.getDriver().get("https://www.google.com");
        log.info("user is on google page");
    }

    @Then("User should see title contains Google")
    public void user_should_see_title_contains_Google() {

        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();

        //2- compare the actual title vs expected title
        String actualTitle=Driver.getDriver().getTitle();
        String expectedIntTitle="Google";
        Assert.assertTrue("Title does not contain expected value!",actualTitle.contains(expectedIntTitle));
        log.info("user sees the title");
    }

    @Then("User types wooden spoon into the search box")
    public void user_types_wooden_spoon_into_the_search_box() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
        googleLandingPage.searchBox.sendKeys("wooden spoon" + Keys.ENTER);
        log.warn("user enters wooden spoon name");
    }

    @Then("User clicks on search button")
    public void user_clicks_on_search_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
        //googleLandingPage.searchButton.click();
    }

    @Then("User should see wooden spoon in the title")
    public void user_should_see_wooden_spoon_in_the_title() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "wooden spoon";

        Assert.assertTrue("Title doesn't match expected one", actualTitle.contains(expectedTitle));

        log.warn("user checks if it's ok");
    }
}