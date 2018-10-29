package elements;

import org.openqa.selenium.By;

public class CatalogPageElements {
    public static By CATALOG_TITLE = By.xpath("//div[@class='g-middle']//h1[contains(., 'Каталог')]");
    public static By MENU_ITEM = By.xpath("//div[@class='g-middle']//li[contains(@data-id, '2')]");
}
