package pages;

import elements.CatalogPageElements;
import org.openqa.selenium.WebDriver;

public class CatalogPage extends HomePage{
    WebDriver driver;

//    public HomePage homePage(){
//        return new HomePage();
//    }

    public void catalogPageIsOpened(){
        driver.findElement(CatalogPageElements.CATALOG_TITLE);
    }

    public void selectMenuItem(){
        driver.findElement(CatalogPageElements.MENU_ITEM).click();
    }
}
