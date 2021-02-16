package com.bartosz.saucedemotests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseSaucePage {
    protected final WebDriver driver;
    protected static final String BASE_URL = "https://www.saucedemo.com/";

    protected BaseSaucePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
