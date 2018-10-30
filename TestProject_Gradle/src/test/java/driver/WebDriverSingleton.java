package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSingleton {
    private static WebDriver webDriver;

    public static WebDriver getInstance() {
        if (webDriver == null) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
            webDriver = new ChromeDriver();
            webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        }
        return webDriver;
    }

    public static void destroyInstance() {
        webDriver = null;
        webDriver.close();
    }
}


//----------------------------------------------------------------------------------------------------
//          if(browser.equals("firefox")){
//            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
//            driver = new FirefoxDriver();
//        }
//        else if(browser.equals("chrome")){
//            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
//            driver = new ChromeDriver();
//        }
//        else if(browser.equals("Edge")){
//            System.setProperty("webdriver.edge.driver", "src\\test\\resources\\MicrosoftWebDriver.exe");
//            driver = new EdgeDriver();
//        }
//        else{
//            throw new Exception("Browser is not correct");
//        }