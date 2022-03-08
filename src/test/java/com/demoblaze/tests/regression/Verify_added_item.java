package com.demoblaze.tests.regression;

import com.demoblaze.base.BaseClass;
import com.demoblaze.pageobjects.HomePage;
import com.demoblaze.pageobjects.ProductPage;
import org.testng.annotations.Test;

public class Verify_added_item extends BaseClass {
    @Test
    public void verify_item_name_price_description_presented() throws InterruptedException {
        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        homePage.clickOnItem();
        productPage.verify_added_item_info();
    }
}
