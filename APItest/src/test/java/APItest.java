import java.util.concurrent.TimeUnit;

import driver.WebDriverSingleton;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class APItest {
    private static WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() {
        driver = WebDriverSingleton.getInstance();
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        baseUrl = "https://swapi.co/api/";
    }

    @Test
    public void apiTesting() {
            driver.get(baseUrl);
            driver.navigate().to(baseUrl+"?format=json");
            WebElement element = driver.findElement(By.xpath("//pre"));
            JSONObject jsonObject = new JSONObject(element.getText());
            String valueToCheck = jsonObject.toString();
            Assert.assertTrue(valueToCheck.contains("planets"));
    }

    @After
    public void tearDown() {
        WebDriverSingleton.destroyInstance();
    }
}
