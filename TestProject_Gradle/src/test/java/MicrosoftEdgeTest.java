import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class MicrosoftEdgeTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:/Users/irina.evsei/IdeaProjects/TestProject_Gradle/src/test/resources/MicrosoftWebDriver.exe");
        String PATH = "https://www.onliner.by/";

        WebDriver driverMicrosoftEdge = new EdgeDriver();
        driverMicrosoftEdge.manage().window().maximize();
        driverMicrosoftEdge.get(PATH);

        WebElement laptop = ((EdgeDriver) driverMicrosoftEdge).findElementByXPath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[2]/a");
        laptop.click();

        WebElement laptopPageTitle = ((EdgeDriver) driverMicrosoftEdge).findElementByClassName("schema-header__title");
        Assert.assertEquals("Ноутбуки", laptopPageTitle.getText());

        driverMicrosoftEdge.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement searchField = ((EdgeDriver) driverMicrosoftEdge).findElementByClassName("fast-search__input");
        searchField.sendKeys("asus vivobook pro 15");

        searchField.sendKeys(Keys.ESCAPE);

//        WebElement searchFieldClose = ((ChromeDriver) driverChrome).findElementByXPath("//div[@class='search__bar']/span[@class='search__close']");
//        searchFieldClose.click();


        System.out.println("It's work.");
//        driverChrome.close();
//        driverChrome.quit();
    }
}
