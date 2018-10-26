package pages;

import elements.CatalogPageElements;
import org.openqa.selenium.WebDriver;

public class CatalogPage {
    WebDriver driver;

    public HomePage homePage(){
        return new HomePage();
    }

    public void selectMenuItem(){
        driver.findElement(CatalogPageElements.MENU_ITEM).click();
    }
}
