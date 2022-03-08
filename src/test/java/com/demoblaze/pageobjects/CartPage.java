package com.demoblaze.pageobjects;

import com.demoblaze.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.demoblaze.base.BaseClass.driver;

public class CartPage {
    @FindBy(css = "#page-wrapper > div > div.col-lg-1 > button")
    WebElement place_orderBtn;

    @FindBy(css = "#name")
    WebElement nameTextField;

    @FindBy(css = "#country")
    WebElement countryTextField;

    @FindBy(css = "#city")
    WebElement cityTextField;

    @FindBy(css = "#card")
    WebElement cardTextField;

    @FindBy(css = "#month")
    WebElement monthTextField;

    @FindBy(css = "#year")
    WebElement yearTextField;

    @FindBy(css = "[onclick='purchaseOrder()']")
    WebElement purchaseBtn;

    @FindBy(linkText = "Delete")
    WebElement delete_link;

    @FindBy(css = "#orderModal > div > div > div.modal-body > form")
    WebElement place_form_box;


    public CartPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }


    public void place_order(String name, String country, String city, String card, String month, String year) throws InterruptedException {
        place_orderBtn.click();
        Thread.sleep(1000);
        nameTextField.sendKeys(name);
        countryTextField.sendKeys(country);
        cityTextField.sendKeys(city);
        cardTextField.sendKeys(card);
        monthTextField.sendKeys(month);
        yearTextField.sendKeys(year);
        purchaseBtn.click();
        Thread.sleep(1000);
    }

    public void remove_item() throws InterruptedException {
        delete_link.click();
    }

    public boolean place_order_form_contain_all_fields() throws InterruptedException {
        place_orderBtn.click();
        Thread.sleep(1000);
        if (nameTextField.isDisplayed() && countryTextField.isDisplayed() && cityTextField.isDisplayed() && cardTextField.isDisplayed() && monthTextField.isDisplayed() && yearTextField.isDisplayed())
            ;
        {
            return true;
        }
    }






}
