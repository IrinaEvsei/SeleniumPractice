package elements;

import org.openqa.selenium.By;

public class CatalogPageElements {
    public static final String URL = "https://catalog.onliner.by/";

//    @FindBy(xpath = "//div[@class='g-middle']//h1[contains(., 'Каталог')]")
//    public static WebElement catalogTitle;
    public static By CATALOG_TITLE = By.xpath("//div[@class='g-middle']//h1[contains(., 'Каталог')]");

//    @FindBy(xpath = "//div[@class='g-middle']//li[contains(@data-id, '2')]")
//    public static WebElement catalogMenuItem;
    public static By MENU_ITEM = By.xpath("//div[@class='g-middle']//li[contains(@data-id, '2')]");
}
