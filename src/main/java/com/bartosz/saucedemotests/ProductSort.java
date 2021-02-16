package com.bartosz.saucedemotests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class ProductSort extends InventoryPage {

    public ProductSort(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".inventory_item_label")
    private WebElement avilableProducts;
    @FindBy(css = ".product_sort_container [value='za']")
    private WebElement nameZASelect;
    @FindBy(css = ".product_sort_container [value='lohi']")
    private WebElement priceLoHiSelect;
    @FindBy(css = ".product_sort_container [value='hilo']")
    private WebElement priceHiLoSelect;
    @FindBy(css = ".inventory_item_price")
    private WebElement itemPriceSelect;
    @FindBy(css = ".product_sort_container")
    private WebElement productSortContainer;


    List<String> getListOfPrices() {
        return driver.findElements(By.cssSelector(".inventory_item_price"))
                .stream().map(webElement -> webElement.getText())
                .collect(Collectors.toList());
    }

    protected void sortItemsHiLo() {
        productSortContainer.click();
        priceHiLoSelect.click();
    }


}
