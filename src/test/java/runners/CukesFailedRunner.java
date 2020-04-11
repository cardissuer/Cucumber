package runners;

import com.aventstack.extentreports.ExtentReports;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utilities.extent;

@RunWith(Cucumber.class)
@CucumberOptions(
            features = {"@target/rerun.txt"},
            plugin = {
                    "pretty", "html:target/cucumber-html-report2",
                    "json:target/cucumber2.json", "junit:target/cucumber2.xml"},
            glue = "steps_definitions")

public class CukesFailedRunner {
}