package step_definitions;

import com.aventstack.extentreports.ExtentReports;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.TempStorage;
import utilities.extent;
import utilities.log;

public class Hooks {

    @Before
    public void setup (Scenario scenario){
        //Anything you want to run before each scenario
        TempStorage.clear();
        log.start(scenario.getName());
    }

    @After
    public void tearDown (Scenario scenario){
        System.out.println(scenario.getName());
        System.out.println(scenario.getStatus());
        if (scenario.isFailed()) {
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            // byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
            scenario.embed(screenshot,"image/png");
            extent.fail();
        } else {
            extent.pass();
        }
    }
}