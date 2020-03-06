package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extent {



    private static ExtentHtmlReporter config;
    private static ExtentReports report;
    private static ExtentTest extentTest;

    static {
        config = new ExtentHtmlReporter("./extenreport/report.html");
        config.config().setTheme(Theme.DARK);
        config.config().setDocumentTitle("The Extent Report");
        report = new ExtentReports();
        report.attachReporter(config);
        report.setSystemInfo("environment", "GOOGLE");
    }

    private static void startTest (String testName){
        extentTest = report.createTest(testName);
    }

    public static void pass (){
        extentTest.pass("PASS");
    }

    public static void fail (){
        extentTest.fail("FAILED");
        //extent.fail("message", MediaEntityBuilder );
    }

    public static void endreport (){
        report.flush();
    }
}
