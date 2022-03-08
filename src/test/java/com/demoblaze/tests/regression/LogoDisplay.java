package com.demoblaze.tests.regression;

import com.demoblaze.base.BaseClass;
import com.demoblaze.pageobjects.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoDisplay extends BaseClass {

    @Test
    public void logoIsDisplayed() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.logoIsDisplayed();
    }
}
