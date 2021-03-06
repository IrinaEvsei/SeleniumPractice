package test;

import driver.WebDriverSingleton;
import logger.Log;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;

    @BeforeTest
    public void openPage(){
        Log.startLog("Driver != null. Testing is starting!");
        if (driver == null){
            driver = WebDriverSingleton.getInstance();
            driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        }
    }

    @AfterTest
    public void shutDown() {
        Log.endLog("Testing is ending!");
        driver.close();
        driver.quit();
        WebDriverSingleton.destroyInstance();
    }

}
