package com.demoblaze.tests.smoke;

import com.demoblaze.base.BaseClass;
import com.demoblaze.pageobjects.CartPage;
import com.demoblaze.pageobjects.HomePage;
import com.demoblaze.pageobjects.ProductPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceOrder extends BaseClass {

    @Test
    public void place_order_with_filled_form() throws InterruptedException {
        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();
        homePage.clickOnItem();
        productPage.addToCart();
        homePage.click_cart_link();
        cartPage.place_order("anwar", "us", "D.C", "0123456789", "11", "2021");
        String successMessage = driver.findElement(By.cssSelector("[class='sweet-alert  showSweetAlert visible']")).getText();
        Assert.assertTrue(successMessage.contains("Thank you"));
    }


    @Test
    public void place_order_with_missed_fields() throws InterruptedException {
        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();
        homePage.clickOnItem();
        productPage.addToCart();
        homePage.click_cart_link();
        cartPage.place_order("anwar", "", "", "0123456789", "", "");
        String failedMessage = driver.findElement(By.cssSelector("[class='sweet-alert  showSweetAlert visible']")).getText();
        Assert.assertTrue(failedMessage.contains("You did not fill out all fields"));
    }
}
