package pages;

import elements.HomePageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
    static WebDriver driver;

    public HomePage() {
        this.driver=driver;
    }

    public void initDrivers(String browser) throws Exception{
        if(browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equals("Edge")){
            System.setProperty("webdriver.edge.driver", "src\\test\\resources\\MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        }
        else{
            throw new Exception("Browser is not correct");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void getHomePage() {
        driver.get(HomePageElements.URL);
    }

    public void clickOpenCatalog() {
        driver.findElement(HomePageElements.OPEN_CATALOG).click();
        //WebElement element = driver.findElement(HomePageElements.OPEN_CATALOG);
        //element.click();
    }

    public void driverClose(){
        driver.close();
        driver.quit();
    }
}