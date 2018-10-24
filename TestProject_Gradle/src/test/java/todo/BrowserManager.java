package todo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BrowserManager {
    private static WebDriver webDriver;
    private Properties properties;

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public BrowserManager(){
        properties = getProperties();
        switch(properties.getProperty("browser")){
            case "Chrome":
                System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
                webDriver = new ChromeDriver();
                break;

            case "Firefox":
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
                webDriver = new FirefoxDriver();
                break;

            case "Edge":
                System.setProperty("webdriver.edge.driver", "src\\test\\resources\\MicrosoftWebDriver.exe");
                webDriver = new EdgeDriver();
                break;
        }
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    Properties getProperties() {
        try {
            InputStream input = new FileInputStream("src\\test\\resources\\config.properties");
            Properties props = new Properties();
            props.load(input);
            return props;
        } catch (IOException e) {
            Logger.getAnonymousLogger().log(Level.SEVERE, "Something goes wrong");
            System.exit(-1);
            return null;
        }
    }
}
