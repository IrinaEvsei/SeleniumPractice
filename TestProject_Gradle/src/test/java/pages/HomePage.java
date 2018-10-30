package pages;

import driver.WebDriverSingleton;
import elements.HomePageElements;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage() {}

    public void getHomePage() {
        driver.get(HomePageElements.URL);
    }

    public void clickOpenCatalog() {
        driver.findElement(HomePageElements.OPEN_CATALOG).click();
    }

}