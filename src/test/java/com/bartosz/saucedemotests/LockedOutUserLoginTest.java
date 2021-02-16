package com.bartosz.saucedemotests;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LockedOutUserLoginTest extends BaseTest{

    @Test
    public void logInUser() {
        mainPage.logInLockedOutUser();
        String expectedResult = "Epic sadface: Sorry, this user has been locked out.";
        String actualResult = mainPage.errorStatus.getText();
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
