import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:/Users/irina.evsei/IdeaProjects/TestProject_Gradle/src/test/resources/chromedriver.exe");
        String PATH = "https://www.onliner.by/";

        WebDriver driverChrome = new ChromeDriver();
        driverChrome.manage().window().maximize();
        driverChrome.get(PATH);

        WebElement laptop = ((ChromeDriver) driverChrome).findElementByXPath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[2]/a");
        laptop.click();

        WebElement laptopPageTitle = ((ChromeDriver) driverChrome).findElementByClassName("schema-header__title");
        Assert.assertEquals("Ноутбуки", laptopPageTitle.getText());


        WebElement searchField = ((ChromeDriver) driverChrome).findElementByClassName("fast-search__input");
        searchField.sendKeys("asus vivobook pro 15");

        searchField.sendKeys(Keys.ESCAPE);

//        WebElement searchFieldClose = ((ChromeDriver) driverChrome).findElementByXPath("//div[@class='search__bar']/span[@class='search__close']");
//        searchFieldClose.click();


        System.out.println("Google Chrome Driver is work.");
//        driverChrome.close();
//        driverChrome.quit();
    }
}
