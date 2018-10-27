package elements;

import org.openqa.selenium.By;

public class CatalogPageElements {
    public static By CATALOG_TITLE = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/h1");
    public static By MENU_ITEM = By.xpath("//div[@class='g-middle']//li[contains(@data-id, '2')]");
}
