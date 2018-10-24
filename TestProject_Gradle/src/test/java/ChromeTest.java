import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class ChromeTest {

    @Test
    public void main() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        String PATH = "https://www.onliner.by/";

        WebDriver driverChrome = new ChromeDriver();
        driverChrome.manage().window().maximize();
        driverChrome.get(PATH);

        Thread.sleep(2000);

        WebElement laptop = ((ChromeDriver) driverChrome).findElementByXPath("//span[@class='project-navigation__text']//span[contains(.,'Ноутбуки')]");
        laptop.click();

        WebElement laptopPageTitle = ((ChromeDriver) driverChrome).findElementByXPath("//h1[@class='schema-header__title']");
        //WebElement laptopPageTitle = (WebElement) ((ChromeDriver) driverChrome).findElementsByXPath("//h1[@class='schema-header__title']");
        Assert.assertEquals("Ноутбуки", laptopPageTitle.getText());

        WebElement searchField = ((ChromeDriver) driverChrome).findElementByClassName("fast-search__input");
        searchField.sendKeys("asus vivobook pro 15");
        searchField.sendKeys(Keys.ESCAPE);

        WebElement inputMinPrice = ((ChromeDriver) driverChrome).findElementByXPath("//*[@id=\"schema-filter\"]/div[1]/div[4]/div[2]/div/div[1]/input");
        inputMinPrice.sendKeys("1");

        WebElement minPriceTag = ((ChromeDriver) driverChrome).findElementByXPath("//div[@id='schema-tags']//span[contains(., 'от 1')]");
        Assert.assertTrue(String.valueOf(minPriceTag),true);

        Thread.sleep(2000);

        System.out.println("Google Chrome Driver is work.");
        driverChrome.close();
        driverChrome.quit();
    }
}
