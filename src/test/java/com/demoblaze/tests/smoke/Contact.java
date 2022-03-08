package com.demoblaze.tests.smoke;

import com.demoblaze.base.BaseClass;
import com.demoblaze.pageobjects.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Contact extends BaseClass {
    @Test
    public void send_empty_contact_form() throws InterruptedException {
        HomePage loginPage = new HomePage();
        loginPage.send_contact_form("", "", "");
        String text = driver.switchTo().alert().getText();
        Assert.assertTrue(text.contains("Please complete contact form"));
    }

    @Test
    public void send_filled_contact_form() throws InterruptedException {
        HomePage loginPage = new HomePage();
        loginPage.send_contact_form("anwar@gmail,com", "anwar", "Good night");
        String text = driver.switchTo().alert().getText();
        Assert.assertTrue(text.contains("Thanks"));
    }
}
