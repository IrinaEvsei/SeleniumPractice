package todo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class BrowserManager {
    private static WebDriver webDriver;
    public String input;

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public BrowserManager(){
        switch(input){
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
}
