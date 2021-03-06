package elements;

import org.openqa.selenium.By;

public class AudiointerfacePageElements {

//    @FindBy(xpath = "//*[@id=\"schema-filter\"]/div[1]/div[4]/div[2]/div/div[1]/input")
//    public static WebElement audiointerfaceMinPrice;
    public static By AUDIOINTERFACE_MIN_PRICE = By.xpath("//*[@id=\"schema-filter\"]/div[1]/div[5]/div[2]/div/div[1]/input");

//    @FindBy(xpath = "//*[@id=\"schema-tags\"]/div/span")
//    public static WebElement audiointerfaceMinPriceTag;
    public static By MIN_PRICE_TAG = By.xpath("//*[@id=\"schema-tags\"]/div/span");

//    @FindBy(xpath = "//*[@id=\"schema-products\"]/div")
//    public WebElement warningMessage;

    public static By WARNING_MESSAGE = By.xpath("//div[@class='schema-products__message']");
}
