package pages;

import driver.WebDriverSingleton;
import elements.CatalogNavigationPageElements;
import elements.CatalogPageElements;
import org.openqa.selenium.WebDriver;


public class CatalogNavigationPage{
//public class CatalogNavigationPage extends CatalogNavigationPageElements {
    WebDriver driver = WebDriverSingleton.getInstance();

    public CatalogNavigationPage(WebDriver driver) { this.driver = driver;}

    public CatalogNavigationPage() {}

    public void openCatalogNavigationPage(){
//        catalogMenuItem.click();
        driver.findElement(CatalogPageElements.MENU_ITEM).click();
    }

    public void selectCatalogNavigationMenu(){
//        catalogNvigationList.click();
        driver.findElement(CatalogNavigationPageElements.CATALOG_NAVIGATION_LIST).click();
    }

    public void selectCatalogNavigationMenuItem(){
//        catalogNvigationListItem.click();
        driver.findElement(CatalogNavigationPageElements.CATALOG_NAVIGATION_LIST_ITEM).click();
    }
}
