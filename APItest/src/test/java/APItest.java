import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import driver.WebDriverSingleton;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class APItest {
    public static WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = WebDriverSingleton.getInstance();
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        baseUrl = "https://swapi.co/api/";
    }

    @Test
    public void aptTesting() throws Exception {
            URL url = new URL(baseUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("HTTP error code : " + conn.getResponseCode());
            }
            else {
                System.out.println("OK");
            }
    }

    @After
    public void tearDown() {
        WebDriverSingleton.destroyInstance();
    }
}
