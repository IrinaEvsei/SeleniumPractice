package test;

import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomePageTest {
    private WebDriver driver;
    HomePage homePage = new HomePage();

    @Test
    @DisplayName("Open Catalog")
    public void testHomePage() throws Exception {
        homePage.initDrivers("chrome");
        homePage.getHomePage();
        homePage.clickOpenCatalog();

    }

    @After
    public void shutDown() {
        driver.close();
    }
}