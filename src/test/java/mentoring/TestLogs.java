package mentoring;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilities.log;

public class TestLogs {

    public static void main(String[] args) {

//        Logger logger = LogManager.getLogger(TestLogs.class);
//        System.out.println("some test executions started");
//        System.out.println("going to dZone.com");
//        logger.info("on Dzone com");
//        System.out.println("Click on logging button");
//        logger.warn ("Login in the app");

//        System.out.println("test started");
//        log.info("Header comparison");
//        System.out.println("go to Amazon");
//        log.info("user is on the Amazon");
//        System.out.println("login to Amazon");
//        log.warn("user logged in Amazon");

        ExtentHtmlReporter config = new ExtentHtmlReporter("./extenreport/report.html");
        config.config().setTheme(Theme.DARK);
        ExtentReports report = new ExtentReports();
        report.attachReporter(config);
        System.out.println("start test");
        ExtentTest extentTest = report.createTest("Google Search");
        extentTest.pass("it's passed");
        extentTest.fail("it's FAILED");
        report.flush();
        System.out.println("completed");
    }
}