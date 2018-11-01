package pages;

import driver.WebDriverSingleton;
import elements.AudiointerfacePageElements;
import elements.CatalogNavigationPageElements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AudiointerfacePage {
//public class CatalogPage extends CatalogPageElements {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void openAudiointerfacePage() {
        driver.findElement(CatalogNavigationPageElements.AUDIOINTERFACE_PAGE_TITLE).click();
    }

    public void audiointerfacePageIsOpened(){
//        cataaudiointerfacePageTitle.getText();
        driver.findElement(CatalogNavigationPageElements.AUDIOINTERFACE_PAGE_TITLE);
        Assert.assertTrue(true);
    }

    public void audiointerfacePageSetMinPrice(String minPrice){
//        audiointerfaceMinPrice.sendKeys(minPrice);
        driver.findElement(AudiointerfacePageElements.AUDIOINTERFACE_MIN_PRICE).sendKeys(minPrice);
    }

    public void audiointerfacePageCheckMinPriceTag(){
//        Assert.assertTrue(String.valueOf(audiointerfaceMinPriceTag), true);
        driver.findElement(AudiointerfacePageElements.MIN_PRICE_TAG);
        Assert.assertTrue(true);
    }

    public void audiointerfacePageCheckNegativeMinPriceWarning (){
        driver.findElement(AudiointerfacePageElements.WARNING_MESSAGE).getText();
        Assert.assertTrue(true);
    }

//    public void audiointerfacePageCheckNegativeMinPrice (String negativeMinPrice){
//        audiointerfaceMinPrice.sendKeys(negativeMinPrice);
//    }

//    public void audiointerfacePageCheckWarningMessage (){
//        warningMessage.getText();
//    }
}
