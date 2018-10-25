package todo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager {
    public WebDriver webDriver;


    WebDriver getWebDriver() {
        return webDriver;
    }

     public void initDriver(){

        switch("Chrome"){
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
                webDriver = new ChromeDriver();
                break;

            case "Firefox":
                System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
                webDriver = new FirefoxDriver();
                break;

            case "Edge":
                System.setProperty("webdriver.edge.driver", "src\\test\\resources\\MicrosoftWebDriver.exe");
                webDriver = new EdgeDriver();
                break;
            default :
                System.out.println("Incorrect value!");
        }
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


}