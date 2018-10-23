import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.ie.driver", "C:/Users/irina.evsei/IdeaProjects/TestProject_Gradle/src/test/resources/IEDriverServer.exe");
        String PATH = "https://www.onliner.by/";

        WebDriver driverInternetExplorer = new InternetExplorerDriver();
        driverInternetExplorer.manage().window().maximize();
        driverInternetExplorer.get(PATH);

        WebElement laptop = ((InternetExplorerDriver) driverInternetExplorer).findElementByXPath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[2]/a");
        laptop.click();

        WebElement laptopPageTitle = ((InternetExplorerDriver) driverInternetExplorer).findElementByClassName("schema-header__title");
        Assert.assertEquals("Ноутбуки", laptopPageTitle.getText());


        WebElement searchField = ((InternetExplorerDriver) driverInternetExplorer).findElementByClassName("fast-search__input");
        searchField.sendKeys("asus vivobook pro 15");

       // driverInternetExplorer.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        searchField.sendKeys(Keys.ESCAPE);

//        WebElement searchFieldClose = ((InternetExplorerDriver) driverInternetExplorer).findElementByXPath("//div[@class='search__bar']/span[@class='search__close']");
//        searchFieldClose.click();


        System.out.println("It's work.");
//        driverInternetExplorer.close();
//        driverInternetExplorer.quit();

    }
}
