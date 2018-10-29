package elements;

import org.openqa.selenium.By;

public class CatalogNavigationPageElements {
    public static By CATALOG_NAVIGATION_LIST = By.xpath("//div[@class='catalog-navigation-list__aside-list']//div[contains(., 'Мультимедиа периферия')]");
    public static By CATALOG_NAVIGATION_LIST_ITEM = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div[1]/div/div[6]/div[2]/div/a[5]"); //???
    public static By AUDIOINTERFACE_PAGE_TITLE = By.xpath("//div[@class='schema-header']//h1[contains(., 'Аудиоинтерфейсы')]");
}
