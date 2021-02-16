package com.bartosz.saucedemotests;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StandardUserLogInTest extends BaseTest {

    @Test
    public void logInUser() {
        mainPage.logInStandardUser();
        assertThat(inventoryPage.getCurrentUrl()).
                isEqualTo(InventoryPage.URL);
    }
}
