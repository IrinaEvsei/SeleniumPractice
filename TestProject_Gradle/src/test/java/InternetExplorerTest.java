import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerTest {
    @Test
    public void internetExplorerTest() throws InterruptedException {

        System.setProperty("webdriver.ie.driver", "src\\test\\resources\\IEDriverServer.exe");
        String PATH = "https://www.onliner.by/";

        WebDriver driverInternetExplorer = new InternetExplorerDriver();
        driverInternetExplorer.manage().window().maximize();
        driverInternetExplorer.get(PATH);

        Thread.sleep(7000);
        WebElement laptop = ((InternetExplorerDriver) driverInternetExplorer).findElementByXPath("//span[@class='project-navigation__text']//span[contains(.,'Ноутбуки')]");
        laptop.click();

        WebElement laptopPageTitle = ((InternetExplorerDriver) driverInternetExplorer).findElementByClassName("schema-header__title");
        Assert.assertEquals("Ноутбуки", laptopPageTitle.getText());


        WebElement searchField = ((InternetExplorerDriver) driverInternetExplorer).findElementByClassName("fast-search__input");
        searchField.sendKeys("asus vivobook pro 15");


        System.out.println("It's work.");
        driverInternetExplorer.close();
        driverInternetExplorer.quit();

    }
}
