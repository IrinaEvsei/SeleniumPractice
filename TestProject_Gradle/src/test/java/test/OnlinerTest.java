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
    Logger log = Logger.getLogger("devpinoyLogger");

    @Test
    @DisplayName("Open Catalog")
    public void testHomePage() {
        log.debug("open website");
        homePage.getHomePage();
        log.debug("getHomePage");
        homePage.clickOpenCatalog();
        log.debug("clickOpenCatalog");
    }

    @Test
    @DisplayName("Select item in menu")
    public void testCatalogPage() {
        homePage.getHomePage();
        catalogPage.openCatalogPage();
        catalogPage.catalogPageIsOpened();
        catalogPage.selectMenuItem();
    }

    @Test
    @DisplayName("Open navigation menu and select the item")
    public void testCatalogNavigationMenuPage(){
        homePage.getHomePage();
        catalogPage.openCatalogPage();
        catalogNavigationPage.openCatalogNavigationPage();
        catalogNavigationPage.selectCatalogNavigationMenu();
        catalogNavigationPage.selectCatalogNavigationMenuItem();
    }

    @Test
    @DisplayName("Open audiointerface page and set min price in filter")
    public void testAudiointerfacePage(){
        homePage.getHomePage();
        catalogPage.openCatalogPage();
        catalogNavigationPage.openCatalogNavigationPage();
        catalogNavigationPage.selectCatalogNavigationMenu();
        catalogNavigationPage.selectCatalogNavigationMenuItem();
        audiointerfacePage.openAudiointerfacePage();
        audiointerfacePage.audiointerfacePageIsOpened();
        audiointerfacePage.audiointerfacePageSetMinPrice(MIN_PRICE);
        audiointerfacePage.audiointerfacePageCheckMinPriceTag();

    }

    @Test
    @DisplayName("Open audiointerface page and set min price in filter")
    public void testNegativePriceAudiointerfacePage(){
        homePage.getHomePage();
        catalogPage.openCatalogPage();
        catalogNavigationPage.openCatalogNavigationPage();
        catalogNavigationPage.selectCatalogNavigationMenu();
        catalogNavigationPage.selectCatalogNavigationMenuItem();
        audiointerfacePage.openAudiointerfacePage();
        audiointerfacePage.audiointerfacePageIsOpened();
        audiointerfacePage.audiointerfacePageSetMinPrice(NEGATIVE_PRICE);
        audiointerfacePage.audiointerfacePageCheckNegativeMinPriceWarning();
    }

}