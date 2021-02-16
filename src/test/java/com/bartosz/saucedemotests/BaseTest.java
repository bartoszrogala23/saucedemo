package com.bartosz.saucedemotests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

abstract class BaseTest {
    protected MainPage mainPage;
    protected InventoryPage inventoryPage;
    protected ProductSort productSort;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        inventoryPage = new InventoryPage(driver);
        productSort = new ProductSort(driver);
        driver.get("https://www.saucedemo.com/");
    }

//    TODO Aftermethod
}
