package com.demoblaze.pageobjects;

import com.demoblaze.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.demoblaze.base.BaseClass.driver;


public class ProductPage {
    @FindBy(css = "#tbodyid > div.row > div > a")
    WebElement add_to_cart_btn;

    @FindBy(css = "[id='tbodyid']")
    WebElement added_item_info;

    public void addToCart() throws InterruptedException {
        add_to_cart_btn.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
    }

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }


    public void verify_added_item_info() {
        String product_info = added_item_info.getText();
        Assert.assertFalse(product_info.contains("includes tax"));
    }

    public void added_item_alert() throws InterruptedException {
        add_to_cart_btn.click();
        Thread.sleep(1000);
        String text = driver.switchTo().alert().getText();
        Assert.assertTrue(text.contains("added"));
    }
}
