package com.demoblaze.tests.regression;

import com.demoblaze.base.BaseClass;
import com.demoblaze.pageobjects.CartPage;
import com.demoblaze.pageobjects.HomePage;
import org.testng.annotations.Test;

public class Fields_displayed_place_form extends BaseClass {
    @Test
    public void fields_displayed_place_form() throws InterruptedException {
      CartPage cartPage = new CartPage();
        HomePage homePage = new HomePage();
        homePage.click_cart_link();
      cartPage.place_order_form_contain_all_fields();
    }
}
