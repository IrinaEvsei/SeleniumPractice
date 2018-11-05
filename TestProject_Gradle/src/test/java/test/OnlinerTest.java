package test;

import logger.Log;
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
    //private Logger log = Logger.getLogger("Logger");

    @Test
    @DisplayName("Open Catalog")
    public void testHomePage() {
        Log.debug("open browser");
        homePage.getHomePage();
        Log.debug("Home Page");
        homePage.clickOpenCatalog();
        Log.debug("Catalog page is opened");

        Log.debug("\nTest1 is end");
    }

    @Test
    @DisplayName("Select item in menu")
    public void testCatalogPage() {
        Log.debug("open browser");
        homePage.getHomePage();
        Log.debug("Home Page");
        catalogPage.openCatalogPage();
        Log.debug("Catalog page is opened");
        catalogPage.catalogPageIsOpened();
        Log.debug("Сheck that Catalog page is opened");
        catalogPage.selectMenuItem();
        Log.debug("Select an item in a menu on Catalog page");

        Log.debug("\nTest2 is end");
    }

    @Test
    @DisplayName("Open navigation menu and select the item")
    public void testCatalogNavigationMenuPage(){
        Log.debug("open browser");
        homePage.getHomePage();
        Log.debug("Home Page");
        catalogPage.openCatalogPage();
        Log.debug("Catalog page is opened");
        catalogNavigationPage.openCatalogNavigationPage();
        Log.debug("Catalog Navigation menu is opened");
        catalogNavigationPage.selectCatalogNavigationMenu();
        Log.debug("Selected item in navigation menu");
        catalogNavigationPage.selectCatalogNavigationMenuItem();
        Log.debug("Selected item in navigation sub-menu");

        Log.debug("\nTest3 is end");
    }

    @Test
    @DisplayName("Open audiointerface page and set min price in filter")
    public void testAudiointerfacePage(){
        Log.debug("open browser");
        homePage.getHomePage();
        Log.debug("Home Page");
        catalogPage.openCatalogPage();
        Log.debug("Catalog page is opened");
        catalogNavigationPage.openCatalogNavigationPage();
        Log.debug("Catalog Navigation menu is opened");
        catalogNavigationPage.selectCatalogNavigationMenu();
        Log.debug("Selected item in navigation menu");
        catalogNavigationPage.selectCatalogNavigationMenuItem();
        Log.debug("Selected item in navigation sub-menu");
        audiointerfacePage.openAudiointerfacePage();
        Log.debug("Audiointerface page is opened");
        audiointerfacePage.audiointerfacePageIsOpened();
        Log.debug("Сheck that Audiointerface page is opened");
        audiointerfacePage.audiointerfacePageSetMinPrice(MIN_PRICE); //???
        Log.debug("Set min price = 1");
        audiointerfacePage.audiointerfacePageCheckMinPriceTag();

        Log.debug("\nTest4 is end");
    }

    @Test
    @DisplayName("Open audiointerface page and set min price in filter")
    public void testNegativePriceAudiointerfacePage(){
        Log.debug("open browser");
        homePage.getHomePage();
        Log.debug("Home Page");
        catalogPage.openCatalogPage();
        Log.debug("Catalog page is opened");
        catalogNavigationPage.openCatalogNavigationPage();
        Log.debug("Catalog Navigation menu is opened");
        catalogNavigationPage.selectCatalogNavigationMenu();
        Log.debug("Selected item in navigation menu");
        catalogNavigationPage.selectCatalogNavigationMenuItem();
        Log.debug("Selected item in navigation sub-menu");
        audiointerfacePage.openAudiointerfacePage();
        Log.debug("Audiointerface page is opened");
        audiointerfacePage.audiointerfacePageIsOpened();
        Log.debug("Сheck that Audiointerface page is opened");
        audiointerfacePage.audiointerfacePageSetMinPrice(NEGATIVE_PRICE);
        Log.debug("Set min price = -1");
        audiointerfacePage.audiointerfacePageCheckNegativeMinPriceWarning();
        Log.debug("Check warning message");

        Log.debug("\nTest5 is end");
    }

}