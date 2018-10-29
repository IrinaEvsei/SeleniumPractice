package pages;

import driver.WebDriverSingleton;
import elements.CatalogPageElements;
import elements.HomePageElements;
import org.openqa.selenium.WebDriver;

public class CatalogPage {
    WebDriver driver = WebDriverSingleton.getInstance();;

    public HomePage openCatalogPage(){
        driver.findElement(HomePageElements.OPEN_CATALOG).click();
        return new HomePage(driver);
    }

    public void catalogPageIsOpened(){
        driver.findElement(CatalogPageElements.CATALOG_TITLE);
    }

    public void selectMenuItem(){
        driver.findElement(CatalogPageElements.MENU_ITEM).click();
    }
}
