package com.demoblaze.tests.regression;

import com.demoblaze.base.BaseClass;
import com.demoblaze.pageobjects.HomePage;
import org.testng.annotations.Test;

public class Footer_info extends BaseClass {
    @Test
    public void verify_about_us_get_touch_contents_isDisplayed() {
        HomePage homePage = new HomePage();
        homePage.verify_content_displayed();
    }
}
