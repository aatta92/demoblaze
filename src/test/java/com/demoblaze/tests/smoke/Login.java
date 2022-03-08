package com.demoblaze.tests.smoke;

import com.demoblaze.base.BaseClass;
import com.demoblaze.pageobjects.HomePage;
import org.apache.commons.compress.archivers.StreamingNotSupportedException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseClass {


    @Test
    public void login_with_valid_account() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.login("geek", "geek");
        String text = driver.findElement(By.cssSelector("#nameofuser")).getText();
        Assert.assertTrue(text.contains("geek"));
    }

    @Test
    public void login_with_invalid_account() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.login("keeg", "keeg");
        String text = driver.switchTo().alert().getText();
        Assert.assertTrue(text.contains("does not"));
    }
}
