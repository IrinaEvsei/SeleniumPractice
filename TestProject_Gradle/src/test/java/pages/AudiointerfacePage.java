package pages;

import driver.WebDriverSingleton;
import elements.AudiointerfacePageElements;
import elements.CatalogNavigationPageElements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AudiointerfacePage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public CatalogNavigationPage openAudiointerfacePage(){
        driver.findElement(CatalogNavigationPageElements.AUDIOINTERFACE_PAGE_TITLE).click();
        return new CatalogNavigationPage(driver);
    }

    public void audiointerfacePageIsOpened(){
        driver.findElement(CatalogNavigationPageElements.AUDIOINTERFACE_PAGE_TITLE);
        Assert.assertTrue(true);
    }

    public void audiointerfacePageSetMinPrice(){
        //driver.findElement(AudiointerfacePageElements.AUDIOINTERFACE_MIN_PRICE).click();
        driver.findElement(AudiointerfacePageElements.AUDIOINTERFACE_MIN_PRICE).sendKeys("1");
    }

    public void audiointerfacePageCheckMinPriceTag(){
        driver.findElement(AudiointerfacePageElements.MIN_PRICE_TAG);
        Assert.assertTrue(true);
    }
}
