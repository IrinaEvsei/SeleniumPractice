import driver.WebDriverSingleton;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Log4jCalculator {
    public static WebDriver driver;
    static final Logger logger = LogManager.getLogger(Log4jCalculator.class.getName());

    @Before
    public void driver(){
        if (driver == null){
            driver = WebDriverSingleton.getInstance();
            driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        }    }
    @Test
    public void main() {

        DOMConfigurator.configure("log4j.xml");
        logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");

        logger.info("TEST Has Started");

        driver.navigate().to("http://www.calculator.net/");
        logger.info("Open Calc Application");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[4]/div/table/tbody/tr/td[3]/div[2]/a")).click();
        logger.info("Clicked Math Calculator Link");

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();
        logger.info("Clicked Percent Calculator Link");

        driver.findElement(By.id("cpar1")).sendKeys("10");
        logger.info("Entered Value into First Text Box");

        driver.findElement(By.id("cpar2")).sendKeys("50");
        logger.info("Entered Value into Second Text Box");

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr[2]/td/input[2]")).click();
        logger.info("Click Calculate Button");

        String result = driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font/b")).getText();
        logger.info("Get Text Value");

        logger.info(" The Result is " + result);

        if(result.equals("5")) {
            logger.info("The Result is Pass");
        } else {
            logger.error("TEST FAILED. NEEDS INVESTIGATION");
        }

        logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");

    }

    @After
    public void closeDriver() {
        driver.close();
    }
}
