package com.demoblaze.tests.regression;

import com.demoblaze.base.BaseClass;
import com.demoblaze.pageobjects.CartPage;
import com.demoblaze.pageobjects.HomePage;
import com.demoblaze.pageobjects.ProductPage;
import org.testng.annotations.Test;

public class Added_item_alert extends BaseClass {
    @Test
    public void added_item_alert_display() throws InterruptedException {
        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();
        homePage.clickOnItem();
        productPage.addToCart();
        productPage.added_item_alert();
    }
}
