package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogNavigationPageElements {

    @FindBy(xpath = "//div[@class='catalog-navigation-list__aside-list']//div[contains(., 'Мультимедиа периферия')]")
    public static WebElement catalogNvigationList;
    //public static By CATALOG_NAVIGATION_LIST = By.xpath("//div[@class='catalog-navigation-list__aside-list']//div[contains(., 'Мультимедиа периферия')]");

    @FindBy(xpath = "//div[@class='catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[contains(@href, 'audiointerface')]")
    public static WebElement catalogNvigationListItem;
    //public static By CATALOG_NAVIGATION_LIST_ITEM = By.xpath("//div[@class='catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[contains(@href, 'audiointerface')]"); //???

    @FindBy(xpath = "//div[@class='schema-header']//h1[contains(., 'Аудиоинтерфейсы')]")
    public static WebElement cataaudiointerfacePageTitle;
    //public static By AUDIOINTERFACE_PAGE_TITLE = By.xpath("//div[@class='schema-header']//h1[contains(., 'Аудиоинтерфейсы')]");
}
