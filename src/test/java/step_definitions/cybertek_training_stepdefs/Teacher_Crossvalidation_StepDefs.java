package step_definitions.cybertek_training_stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.cybertek_pages.cybertek_homepage;
import utilities.APIUtil;
import utilities.Config;
import utilities.Driver;
import java.net.MalformedURLException;

public class Teacher_Crossvalidation_StepDefs {

    cybertek_homepage cybertek_homepage = new cybertek_homepage();

    public Teacher_Crossvalidation_StepDefs() throws MalformedURLException {
    }

    @Given("user goes to Cybertek training application")
    public void user_goes_to_Cybertek_training_application() {
        // Write code here that turns the phrase above into concrete actionsx
        Driver.getDriver().get(Config.getProperty("cybertekTrainingURL"));
    }

    @Then("user opens teacher profile details page {string}")
    public void user_opens_teacher_profile_details_page(String teacherID) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cybertek_homepage.teachersDropdown.click();
        cybertek_homepage.allTeachersLink.click();
        Thread.sleep(500);
        cybertek_homepage.teacherIDSeachInput.sendKeys(teacherID);
        cybertek_homepage.searchBtn.click();
        cybertek_homepage.avatar.click();
    }

    @Then("user cross validates teacher details on API and UI")
    public void user_cross_validates_teacher_details_on_API_and_UI() {
        // Write code here that turns the phrase above into concrete actions
        String apiFullName = APIUtil.getResponseBody().getTeachers().get(0).getFirstName() + "" + APIUtil.getResponseBody().getTeachers().get(0).getLastName();
        String uiFullName = cybertek_homepage.fullName.getText();
        System.out.println(apiFullName);
        System.out.println(uiFullName);
        Assert.assertEquals("E2E full name verification failed", apiFullName, uiFullName);
        Assert.assertEquals("E2E phone verification failed", APIUtil.getResponseBody().getTeachers().get(0).getPhone().trim(), cybertek_homepage.phoneNumber.getText());
        Assert.assertEquals("E2E email verification failed", APIUtil.getResponseBody().getTeachers().get(0).getEmailAddress().trim(), cybertek_homepage.email.getText());
        Assert.assertEquals("E2E birthdate verification failed", APIUtil.getResponseBody().getTeachers().get(0).getBirthDate().trim(), cybertek_homepage.birthday.getText());
        Assert.assertEquals("E2E joindate verification failed", APIUtil.getResponseBody().getTeachers().get(0).getJoinDate().trim(), cybertek_homepage.joinDate.getText());
        Assert.assertEquals("E2E address verification failed", APIUtil.getResponseBody().getTeachers().get(0).getPremanentAddress().trim(), cybertek_homepage.address.getText());
        Assert.assertEquals("E2E gender verification failed", APIUtil.getResponseBody().getTeachers().get(0).getGender().trim(), cybertek_homepage.gender.getText());
        Assert.assertEquals("E2E salary verification failed", APIUtil.getResponseBody().getTeachers().get(0).getSalary() + "".trim(), cybertek_homepage.salary.getText());
        Assert.assertEquals("E2E section verification failed", APIUtil.getResponseBody().getTeachers().get(0).getSection().trim(), cybertek_homepage.section.getText());
        Assert.assertEquals("E2E subject verification failed", APIUtil.getResponseBody().getTeachers().get(0).getSubject().trim(), cybertek_homepage.subject.getText());
    }
}
