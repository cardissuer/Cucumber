package utilities;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log {

    private static Logger logger = LogManager.getLogger(log.class);

    public static void start (String testName){
        logger.info("Scenario start point" + testName);
    }

    public static void info (String message){
        logger.info(message);
    }

    public static void warn (String message) {
        logger.warn(message);
    }

    public static void error (String message) {
        logger.error(message);
    }

}