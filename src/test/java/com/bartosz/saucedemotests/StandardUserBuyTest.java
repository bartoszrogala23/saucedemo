package com.bartosz.saucedemotests;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StandardUserBuyTest extends BaseTest {

    @Test
    public void addTwoItemsToCart() {
        mainPage.logInStandardUser();
        inventoryPage.addBackpackToCart();
        inventoryPage.addBikeLightToCart();
        String expectedItemsAmountInShoppingCart = "2";
        assertThat(expectedItemsAmountInShoppingCart).
                isEqualTo(inventoryPage.getNumberOfItemsInCart());
    }
}
