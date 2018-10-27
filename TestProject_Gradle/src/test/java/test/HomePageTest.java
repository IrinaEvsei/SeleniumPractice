package test;

import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import pages.CatalogPage;
import pages.HomePage;

public class HomePageTest {
    private HomePage homePage = new HomePage();
    private CatalogPage catalogPage = new CatalogPage();

    @Test
    @DisplayName("Open Catalog")
    public void testHomePage() throws Exception {
        homePage.initDrivers("chrome");
        homePage.getHomePage();
        homePage.clickOpenCatalog();
    }

    // TO DO
    @Test
    @DisplayName("Select item in menu")
    public void testCatalogPage() {
        //catalogPage.getHomePage();
        catalogPage.catalogPageIsOpened();
        catalogPage.selectMenuItem();
    }

    @After
    public void shutDown() {
        homePage.driverClose();
    }
}