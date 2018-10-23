package todo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import todo.BrowserManager;

public class Tests {
    private WebDriver webDriver;

    @Before
    public void initDrivers() {
        webDriver = BrowserManager.getWebDriver();
        webDriver.get("http://onliner.by/");
        webDriver.manage().window().maximize();
    }

    @Test
    public void test() throws InterruptedException {

        Thread.sleep(2000);

        WebElement laptop = ((ChromeDriver) webDriver).findElementByXPath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[2]/a/span/span");
        laptop.click();

        WebElement laptopPageTitle = ((ChromeDriver) webDriver).findElementByClassName("schema-header__title");
        Assert.assertEquals("Ноутбуки", laptopPageTitle.getText());


        WebElement searchField = ((ChromeDriver) webDriver).findElementByClassName("fast-search__input");
        searchField.sendKeys("asus vivobook pro 15");

        Thread.sleep(2000);
    }

    @After
    public void closeBrowser() {
        webDriver.close();
    }
}
