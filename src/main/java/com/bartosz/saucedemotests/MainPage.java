package com.bartosz.saucedemotests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseSaucePage {
    public static final String URL = BASE_URL;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#user-name")
    private WebElement userNameField;
    @FindBy(css = "#password")
    private WebElement passwordField;
    @FindBy(css = "#login-button")
    private WebElement loginButton;
    @FindBy(css = "[data-test='error']")
    public WebElement errorStatus;


    public void logInStandardUser() {
        userNameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
    }

    public void logInLockedOutUser() {
        userNameField.sendKeys("locked_out_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
    }

}
