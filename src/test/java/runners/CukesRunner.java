package runners;

import com.aventstack.extentreports.ExtentReports;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utilities.extent;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports",
        features = "src/test/resources/features",
        glue = "step_definitions",
        dryRun = false,
        tags = "@google"
)
public class CukesRunner {
@AfterClass
    public static void teardown(){
    extent.fail();
}
}