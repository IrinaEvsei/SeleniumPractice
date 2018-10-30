package pages;

import driver.WebDriverSingleton;
import elements.CatalogPageElements;
import org.openqa.selenium.WebDriver;

public class CatalogPage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public CatalogPage(){}

    public void openCatalogPage(){
        driver.get(CatalogPageElements.URL);
    }

    public void catalogPageIsOpened(){
        driver.findElement(CatalogPageElements.CATALOG_TITLE);
    }

    public void selectMenuItem(){
        driver.findElement(CatalogPageElements.MENU_ITEM).click();
    }
}
