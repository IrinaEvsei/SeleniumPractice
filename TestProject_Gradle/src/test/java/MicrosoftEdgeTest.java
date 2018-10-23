import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class MicrosoftEdgeTest {
    @Test
    public void microsoftEdgeTest() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "src\\test\\resources\\MicrosoftWebDriver.exe");
        String PATH = "https://www.onliner.by/";

        WebDriver driverMicrosoftEdge = new EdgeDriver();
        driverMicrosoftEdge.manage().window().maximize();
        driverMicrosoftEdge.get(PATH);

        WebElement laptop = ((EdgeDriver) driverMicrosoftEdge).findElementByXPath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[2]/a");
        laptop.click();

        Thread.sleep(3000);
        WebElement laptopPageTitle = ((EdgeDriver) driverMicrosoftEdge).findElementByClassName("schema-header__title");
        Assert.assertEquals("Ноутбуки", laptopPageTitle.getText());

        driverMicrosoftEdge.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement searchField = ((EdgeDriver) driverMicrosoftEdge).findElementByClassName("fast-search__input");
        searchField.sendKeys("asus vivobook pro 15");

        searchField.sendKeys(Keys.ESCAPE);

        System.out.println("It's work.");
        driverMicrosoftEdge.close();
        driverMicrosoftEdge.quit();
    }
}
