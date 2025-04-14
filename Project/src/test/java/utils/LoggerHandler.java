package utils;
 
import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;
 
public class LoggerHandler {
 
    private static final Logger logger = Logger.getLogger(LoggerHandler.class);
 
    static {
        setupLoggers();
    }
 
    private static void setupLoggers() {
        try {
            // Load the log4j properties file
            PropertyConfigurator.configure("src/main/resources/log4j.properties");
 
            // Set the log file name with a timestamp
            String timestamp = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            String logFileName = "logs/logfile_" + timestamp + ".log";
 
            // Create a file appender with the timestamped log file name
            PatternLayout layout = new PatternLayout("%d{ISO8601} %-5p %c - %m%n");
            FileAppender fileAppender = new FileAppender(layout, logFileName, true);
 
            // Remove existing appenders and add the new appender to the logger
            logger.removeAllAppenders();
            logger.addAppender(fileAppender);
        } catch (Exception e) {
            logger.error("Failed to initialize logger file appender", e);
        }
    }
 
    public static void trace(String message) {
        logger.trace(message);
    }
 
    public static void debug(String message) {
        logger.debug(message);
    }
 
    public static void info(String message) {
        logger.info(message);
    }
 
    public static void warn(String message) {
        logger.warn(message);
    }
 
    public static void error(String message) {
        logger.error(message);
    }
 
    public static void fatal(String message) {
        logger.fatal(message);
    }
}
