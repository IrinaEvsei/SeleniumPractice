package todo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class Tests {
   // BrowserManager manager = new BrowserManager();
   public WebDriver driver;
   public String PATH = "https://www.onliner.by/";


    @BeforeTest
    @Parameters({"browser"})
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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       //manager.initDriver();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get(PATH);
        driver.manage().window().maximize();

        //WebDriver driver = manager.getWebDriver().manage().window().maximize();
        //WebDriver driverChrome = new ChromeDriver();
        //driverChrome.manage().window().maximize();
        // driverChrome.get(PATH);

        Thread.sleep(2000);

        WebElement laptop = driver.findElement(By.xpath("//span[@class='project-navigation__text']//span[contains(.,'Ноутбуки')]"));
        laptop.click();

        WebElement laptopPageTitle = driver.findElement(By.xpath("//h1[@class='schema-header__title']"));
        Assert.assertEquals("Ноутбуки", laptopPageTitle.getText());

        WebElement searchField = driver.findElement(By.xpath("fast-search__input"));
        searchField.sendKeys("asus vivobook pro 15");
        searchField.sendKeys(Keys.ESCAPE);

        WebElement inputMinPrice = driver.findElement(By.xpath("//*[@id=\"schema-filter\"]/div[1]/div[4]/div[2]/div/div[1]/input"));
        inputMinPrice.sendKeys("1");

        WebElement minPriceTag = driver.findElement(By.xpath("//div[@id='schema-tags']//span[contains(., 'от 1')]"));
        Assert.assertTrue(String.valueOf(minPriceTag),true);

        Thread.sleep(2000);

        System.out.println("Google Chrome Driver is work.");
        driver.close();
        driver.quit();
    }
}
