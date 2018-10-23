import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

    @Test
    public void main() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        String PATH = "https://www.onliner.by/";

        WebDriver driverChrome = new ChromeDriver();
        driverChrome.manage().window().maximize();
        driverChrome.get(PATH);

        Thread.sleep(2000);

        WebElement laptop = ((ChromeDriver) driverChrome).findElementByXPath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[2]/a/span/span");
        laptop.click();

        WebElement laptopPageTitle = ((ChromeDriver) driverChrome).findElementByClassName("schema-header__title");
        Assert.assertEquals("Ноутбуки", laptopPageTitle.getText());


        WebElement searchField = ((ChromeDriver) driverChrome).findElementByClassName("fast-search__input");
        searchField.sendKeys("asus vivobook pro 15");

        Thread.sleep(2000);

        System.out.println("Google Chrome Driver is work.");
        driverChrome.close();
        driverChrome.quit();
    }
}
