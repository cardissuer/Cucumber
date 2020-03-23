package step_definitions.cybertek_training_stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import utilities.APIUtil;

public class Teacher_Delete_StepDefs {

    @Given("User deletes Teacher at {string}")
    public void user_deletes_Teacher_at(String resource) {
        // Write code here that turns the phrase above into concrete actions
        APIUtil.hitDelete(resource);;
    }

    @Given("User gets Teacher at {string}")
    public void user_gets_Teacher_at(String resource) {
        // Write code here that turns the phrase above into concrete actions
        APIUtil.hitGET(resource);
    }

    @Then("User verifies response message with {string}")
    public void user_verifies_response_message_with(String expectedMessage) {
        // Write code here that turns the phrase above into concrete actions
        String message = APIUtil.getResponseBody().getMessage();
        Assert.assertEquals("Message isn't verified", expectedMessage, message);
    }
}