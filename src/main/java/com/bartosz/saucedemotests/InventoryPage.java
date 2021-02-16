package com.bartosz.saucedemotests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BaseSaucePage {
    public static final String URL = BASE_URL + "inventory.html";

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#bm-burger-button")
    private WebElement sideMenuButton;
    @FindBy(css = "#logout_sidebar_link")
    private WebElement logoutButton;
    @FindBy(css = "[src='./img/sauce-backpack-1200x1500.jpg']")
    private WebElement backpackSelect;
    @FindBy(css = "[src='./img/bike-light-1200x1500.jpg']")
    private WebElement bikeLightSelect;
    @FindBy(css = ".btn_inventory")
    private WebElement addToCartButton;
    @FindBy(css = ".inventory_details_back_button")
    private WebElement backToProductListButton;
    @FindBy(css = ".shopping_cart_badge")
    private WebElement itemsInShoppingBagBadge;
    @FindBy(css = ".inventory_item_label")
    private WebElement avilableProducts;


    public void addBackpackToCart () {
        backpackSelect.click();
        addToCartButton.click();
        backToProductListButton.click();
    }

    public void addBikeLightToCart () {
        bikeLightSelect.click();
        addToCartButton.click();
        backToProductListButton.click();
    }

    public String getNumberOfItemsInCart() {
        return itemsInShoppingBagBadge.getText();
    }



}
