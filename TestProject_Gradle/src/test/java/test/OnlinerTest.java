package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import pages.AudiointerfacePage;
import pages.CatalogNavigationPage;
import pages.CatalogPage;
import pages.HomePage;

public class OnlinerTest extends BaseTest {

    private static final String MIN_PRICE = "1";
    private static final String NEGATIVE_PRICE = "-1";
    private static final String WARNING = "Что-то пошло не так, и товары не удалось отобразить.Повторите попытку позже.";

    private HomePage homePage = new HomePage();
    private CatalogPage catalogPage = new CatalogPage();
    private CatalogNavigationPage catalogNavigationPage = new CatalogNavigationPage();
    private AudiointerfacePage audiointerfacePage = new AudiointerfacePage();
    private Logger log = Logger.getLogger("Logger");

    @Test
    @DisplayName("Open Catalog")
    public void testHomePage() {
        log.debug("open browser");
        homePage.getHomePage();
        log.debug("Home Page");
        homePage.clickOpenCatalog();
        log.debug("Catalog page is opened");

        log.debug("\nTest1 is end");
    }

    @Test
    @DisplayName("Select item in menu")
    public void testCatalogPage() {
        log.debug("open browser");
        homePage.getHomePage();
        log.debug("Home Page");
        catalogPage.openCatalogPage();
        log.debug("Catalog page is opened");
        catalogPage.catalogPageIsOpened();
        log.debug("Сheck that Catalog page is opened");
        catalogPage.selectMenuItem();
        log.debug("Select an item in a menu on Catalog page");

        log.debug("\nTest2 is end");
    }

    @Test
    @DisplayName("Open navigation menu and select the item")
    public void testCatalogNavigationMenuPage(){
        log.debug("open browser");
        homePage.getHomePage();
        log.debug("Home Page");
        catalogPage.openCatalogPage();
        log.debug("Catalog page is opened");
        catalogNavigationPage.openCatalogNavigationPage();
        log.debug("Catalog Navigation menu is opened");
        catalogNavigationPage.selectCatalogNavigationMenu();
        log.debug("Selected item in navigation menu");
        catalogNavigationPage.selectCatalogNavigationMenuItem();
        log.debug("Selected item in navigation sub-menu");

        log.debug("\nTest3 is end");
    }

    @Test
    @DisplayName("Open audiointerface page and set min price in filter")
    public void testAudiointerfacePage(){
        log.debug("open browser");
        homePage.getHomePage();
        log.debug("Home Page");
        catalogPage.openCatalogPage();
        log.debug("Catalog page is opened");
        catalogNavigationPage.openCatalogNavigationPage();
        log.debug("Catalog Navigation menu is opened");
        catalogNavigationPage.selectCatalogNavigationMenu();
        log.debug("Selected item in navigation menu");
        catalogNavigationPage.selectCatalogNavigationMenuItem();
        log.debug("Selected item in navigation sub-menu");
        audiointerfacePage.openAudiointerfacePage();
        log.debug("Audiointerface page is opened");
        audiointerfacePage.audiointerfacePageIsOpened();
        log.debug("Сheck that Audiointerface page is opened");
        audiointerfacePage.audiointerfacePageSetMinPrice(MIN_PRICE);
        log.debug("Set min price = 1");
        audiointerfacePage.audiointerfacePageCheckMinPriceTag();

        log.debug("\nTest4 is end");
    }

    @Test
    @DisplayName("Open audiointerface page and set min price in filter")
    public void testNegativePriceAudiointerfacePage(){
        log.debug("open browser");
        homePage.getHomePage();
        log.debug("Home Page");
        catalogPage.openCatalogPage();
        log.debug("Catalog page is opened");
        catalogNavigationPage.openCatalogNavigationPage();
        log.debug("Catalog Navigation menu is opened");
        catalogNavigationPage.selectCatalogNavigationMenu();
        log.debug("Selected item in navigation menu");
        catalogNavigationPage.selectCatalogNavigationMenuItem();
        log.debug("Selected item in navigation sub-menu");
        audiointerfacePage.openAudiointerfacePage();
        log.debug("Audiointerface page is opened");
        audiointerfacePage.audiointerfacePageIsOpened();
        log.debug("Сheck that Audiointerface page is opened");
        audiointerfacePage.audiointerfacePageSetMinPrice(NEGATIVE_PRICE);
        log.debug("Set min price = -1");
        audiointerfacePage.audiointerfacePageCheckNegativeMinPriceWarning();
        log.debug("Check warning message");

        log.debug("\nTest5 is end");
    }

}