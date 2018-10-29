package pages;

import driver.WebDriverSingleton;
import elements.CatalogNavigationPageElements;
import elements.CatalogPageElements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CatalogNavigationPage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public CatalogPage openCatalogNavigationPage(){
        driver.findElement(CatalogPageElements.MENU_ITEM).click();
        return new CatalogPage(driver);
    }

    public void selectCatalogNavigationMenu(){
        driver.findElement(CatalogNavigationPageElements.CATALOG_NAVIGATION_LIST).click();
    }

    public void selectCatalogNavigationMenuItem(){
        driver.findElement(CatalogNavigationPageElements.CATALOG_NAVIGATION_LIST_ITEM).click();
    }

    public void audiointerfacePageIsOpened(){
        driver.findElement(CatalogNavigationPageElements.AUDIOINTERFACE_PAGE_TITLE);
        Assert.assertTrue(true);
    }
}
