package com.demoblaze.tests.smoke;

import com.demoblaze.base.BaseClass;
import com.demoblaze.pageobjects.CartPage;
import com.demoblaze.pageobjects.HomePage;
import com.demoblaze.pageobjects.ProductPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.netty.util.internal.SystemPropertyUtil.contains;

public class RemoveItem extends BaseClass {
    @Test
    public void remove_item() throws InterruptedException {
        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();
        homePage.clickOnItem();
        productPage.addToCart();
        homePage.click_cart_link();
        cartPage.remove_item();
        String text = driver.findElement(By.cssSelector("#tbodyid > tr > td:nth-child(4) > a")).getText();
        Assert.assertTrue(text.contains(""));
    }
}
