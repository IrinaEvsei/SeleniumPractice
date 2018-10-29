package test;

import driver.WebDriverSingleton;
import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import pages.CatalogPage;
import pages.HomePage;

public class OnlinerTest {
    private WebDriver driver = WebDriverSingleton.getInstance();

    private HomePage homePage = new HomePage();
    private CatalogPage catalogPage = new CatalogPage();

    @Test
    @DisplayName("Open Catalog")
    public void testHomePage() {
        //homePage.initDrivers("chrome");
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

    @After
    public void shutDown() {
        driver.close();
        WebDriverSingleton.destroyInstance();
    }
}