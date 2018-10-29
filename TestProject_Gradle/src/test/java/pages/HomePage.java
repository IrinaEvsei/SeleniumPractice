package pages;

import driver.WebDriverSingleton;
import elements.HomePageElements;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver = WebDriverSingleton.getInstance();
    //static WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage() {}

//    public void initDrivers(String browser) throws Exception{
//        if(browser.equals("firefox")){
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
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }

    public void getHomePage() {
        driver.get(HomePageElements.URL);
    }

    public void clickOpenCatalog() {
        driver.findElement(HomePageElements.OPEN_CATALOG).click();
    }

    public void driverClose(){
        driver.close();
        driver.quit();
    }
}