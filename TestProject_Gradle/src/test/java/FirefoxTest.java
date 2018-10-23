import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:/Users/irina.evsei/IdeaProjects/TestProject_Gradle/src/test/resources/geckodriver.exe");
        String PATH = "https://www.onliner.by/";

        WebDriver driverFirefox = new FirefoxDriver();
        driverFirefox.manage().window().maximize();
        driverFirefox.get(PATH);

        WebElement laptop = ((FirefoxDriver) driverFirefox).findElementByXPath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[2]/a");
        laptop.click();

        WebElement laptopPageTitle = ((FirefoxDriver) driverFirefox).findElementByClassName("schema-header__title");
        Assert.assertEquals("Ноутбуки", laptopPageTitle.getText());


        WebElement searchField = ((FirefoxDriver) driverFirefox).findElementByClassName("fast-search__input");
        searchField.sendKeys("asus vivobook pro 15");

        //driverFirefox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        searchField.sendKeys(Keys.ESCAPE);

//        WebElement searchFieldClose = ((FirefoxDriver) driverFirefox).findElementByXPath("//div[@class='search__bar']/span[@class='search__close']");
//        searchFieldClose.click();


        System.out.println("Firefox Driver is work.");
//        driverFirefox.close();
//        driverFirefox.quit();

    }
}
