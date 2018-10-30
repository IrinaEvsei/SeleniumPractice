package elements;

import org.openqa.selenium.By;

public class CatalogNavigationPageElements {
    public static By CATALOG_NAVIGATION_LIST = By.xpath("//div[@class='catalog-navigation-list__aside-list']//div[contains(., 'Мультимедиа периферия')]");
    public static By CATALOG_NAVIGATION_LIST_ITEM = By.xpath("//div[@class='catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[contains(@href, 'audiointerface')]"); //???
    public static By AUDIOINTERFACE_PAGE_TITLE = By.xpath("//div[@class='schema-header']//h1[contains(., 'Аудиоинтерфейсы')]");
}
