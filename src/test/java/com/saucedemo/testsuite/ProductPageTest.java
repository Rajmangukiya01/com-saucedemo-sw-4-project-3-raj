package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        int expectedProducts = 6;
        Assert.assertEquals(productsPage.sixProductsDisplayed(),expectedProducts,"Six products are not displayed");
    }
}
