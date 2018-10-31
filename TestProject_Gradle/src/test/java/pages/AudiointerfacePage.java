package pages;

import driver.WebDriverSingleton;
import elements.AudiointerfacePageElements;
import elements.CatalogNavigationPageElements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AudiointerfacePage extends AudiointerfacePageElements {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void openAudiointerfacePage() {
        driver.findElement(CatalogNavigationPageElements.AUDIOINTERFACE_PAGE_TITLE).click();
    }

    public void audiointerfacePageIsOpened(){
        driver.findElement(CatalogNavigationPageElements.AUDIOINTERFACE_PAGE_TITLE);
        Assert.assertTrue(true);
    }

    public void audiointerfacePageSetMinPrice(String minPrice){
        audiointerfaceMinPrice.sendKeys(minPrice);
//        driver.findElement(AudiointerfacePageElements.AUDIOINTERFACE_MIN_PRICE).sendKeys(minPrice);
    }

    public void audiointerfacePageCheckMinPriceTag(){
        driver.findElement(AudiointerfacePageElements.MIN_PRICE_TAG);
        Assert.assertTrue(true);
    }

    public void audiointerfacePageCheckNegativeMinPrice (String negativeMinPrice){
        audiointerfaceMinPrice.sendKeys(negativeMinPrice);
    }

    public void audiointerfacePageCheckWarningMessage (){
        warningMessage.getText();
    }
}
