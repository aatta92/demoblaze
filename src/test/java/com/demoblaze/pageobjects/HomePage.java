package com.demoblaze.pageobjects;

import com.demoblaze.base.BaseClass;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.demoblaze.base.BaseClass.driver;

public class HomePage {
    @FindBy(css = "#login2")
    WebElement login_headerLink;

    @FindBy(css = "#loginusername")
    WebElement username_textFiled;

    @FindBy(css = "#loginpassword")
    WebElement password_textField;

    @FindBy(css = "[onclick='logIn()']")
    WebElement loginBtn;

    @FindBy(css = "[data-target='#exampleModal']")
    WebElement contact_headerLink;

    @FindBy(css = "#recipient-email")
    WebElement contact_email_textField;

    @FindBy(css = "#recipient-name")
    WebElement contact_name_textField;

    @FindBy(css = "#message-text")
    WebElement contact_message_textField;

    @FindBy(css = "[onclick='send()']")
    WebElement contact_sendBtn;

    @FindBy(css = "[src='imgs/Nexus_6.jpg']")
    WebElement click_on_item;

    @FindBy(css = "#cartur")
    WebElement cart_link;

    @FindBy(css = "[class='navbar-brand']")
    WebElement logo_text;

    @FindBy(css = "[id='footc']")
    WebElement footer_box;

    @FindBy(css = "[class='carousel-control-next-icon']")
    WebElement carousel_arrowBtn;

    @FindBy(css = "[src='Samsung1.jpg']")
    WebElement image_source1;

    @FindBy(css = "[src='nexus1.jpg']")
    WebElement image_source2;



    public HomePage() {
        PageFactory.initElements(BaseClass.driver, this);
    }


    public void login(String username, String password) throws InterruptedException {
        login_headerLink.click();
        Thread.sleep(1000);
        username_textFiled.sendKeys(username);
        password_textField.sendKeys(password);
        loginBtn.click();
        Thread.sleep(1000);
    }

    public void send_contact_form(String email, String name, String message) throws InterruptedException {
        contact_headerLink.click();
        Thread.sleep(1000);
        contact_email_textField.sendKeys(email);
        contact_name_textField.sendKeys(name);
        contact_message_textField.sendKeys(message);
        contact_sendBtn.click();
        Thread.sleep(1000);
    }

    public void clickOnItem() {
        click_on_item.click();
    }

    public void click_cart_link() throws InterruptedException {
        cart_link.click();
        Thread.sleep(1000);
    }


    public void logoIsDisplayed() {
        String text = logo_text.getText();
        Assert.assertTrue(text.contains("STORE"));
    }

    public void verify_content_displayed() {
        String text = footer_box.getText();
        Assert.assertTrue(text.contains("believe performance"));
        Assert.assertTrue(text.contains("Address: 2390 El Camino Real"));
    }


    public void carousel_slide() throws InterruptedException {
        carousel_arrowBtn.click();
        Thread.sleep(1000);
        String src1 = image_source1.getAttribute("src");
        String src2 = image_source2.getAttribute("src");
        Assert.assertNotEquals(src1, src2);

    }
}
