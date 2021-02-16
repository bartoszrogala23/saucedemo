package com.bartosz.saucedemotests;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductSortTest extends BaseTest{

    @Test
    public void sortItemsHiLo() {
        mainPage.logInStandardUser();
        List<String> listBeforeSort =  productSort.getListOfPrices();
        productSort.sortItemsHiLo();
        List<String> listAfterSort =  productSort.getListOfPrices();
        assertThat(listBeforeSort).isNotEqualTo(listAfterSort);
    }
}
