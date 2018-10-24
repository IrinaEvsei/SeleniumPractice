import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
    @Test
    public void firefoxTest() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
        String PATH = "https://www.onliner.by/";

        WebDriver driverFirefox = new FirefoxDriver();
        driverFirefox.manage().window().maximize();
        driverFirefox.get(PATH);

        Thread.sleep(2000);

        WebElement laptop = ((FirefoxDriver) driverFirefox).findElementByXPath("//span[@class='project-navigation__text']//span[contains(.,'Ноутбуки')]");
        laptop.click();

        WebElement laptopPageTitle = ((FirefoxDriver) driverFirefox).findElementByXPath("//h1[@class='schema-header__title']");
        Assert.assertEquals("Ноутбуки", laptopPageTitle.getText());


        WebElement searchField = ((FirefoxDriver) driverFirefox).findElementByClassName("fast-search__input");
        searchField.sendKeys("asus vivobook pro 15");

        Thread.sleep(2000);

        searchField.sendKeys(Keys.ESCAPE);

        System.out.println("Firefox Driver is work.");
        driverFirefox.close();
    }
}
