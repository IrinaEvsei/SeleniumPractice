package pages;

import driver.WebDriverSingleton;
import elements.CatalogPageElements;
import org.openqa.selenium.WebDriver;

public class CatalogPage {
//public class CatalogPage extends CatalogPageElements {
    WebDriver driver = WebDriverSingleton.getInstance();

    public CatalogPage(){}

    public void openCatalogPage(){
        driver.get(CatalogPageElements.URL);
    }

    public void catalogPageIsOpened(){
        //catalogTitle.getText();
        driver.findElement(CatalogPageElements.CATALOG_TITLE);
    }

    public void selectMenuItem(){
        //catalogMenuItem.click();
        driver.findElement(CatalogPageElements.MENU_ITEM).click();
    }
}
