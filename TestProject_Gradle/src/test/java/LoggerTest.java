import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTest {

    static String CONFIG_FILE = "C:/Users/irina.evsei/IdeaProjects/TestProject_Gradle/src/test/resources/log4j.properties";

    public static final Logger logger = Logger.getLogger(LoggerTest.class.getName());

    @BeforeClass
    public static void getLogger(){
        System.out.println(CONFIG_FILE);
        PropertyConfigurator.configure(CONFIG_FILE);
    }

    @Test
    public void testLogger() {
        getLogger();
        logger.info("log test1");
        logger.info("log test2");
        logger.info("log test3");
        logger.info("log test4");
    }
}
