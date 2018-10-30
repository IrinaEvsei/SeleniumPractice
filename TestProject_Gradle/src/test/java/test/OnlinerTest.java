package test;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import pages.AudiointerfacePage;
import pages.CatalogNavigationPage;
import pages.CatalogPage;
import pages.HomePage;

public class OnlinerTest extends BaseTest {

    private HomePage homePage = new HomePage();
    private CatalogPage catalogPage = new CatalogPage();
    private CatalogNavigationPage catalogNavigationPage = new CatalogNavigationPage();
    private AudiointerfacePage audiointerfacePage = new AudiointerfacePage();

    @Test
    @DisplayName("Open Catalog")
    public void testHomePage() {
        homePage.getHomePage();
        homePage.clickOpenCatalog();
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
        audiointerfacePage.audiointerfacePageSetMinPrice("1");
        audiointerfacePage.audiointerfacePageCheckMinPriceTag();

    }
}