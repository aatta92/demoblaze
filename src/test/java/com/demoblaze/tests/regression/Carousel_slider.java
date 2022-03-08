package com.demoblaze.tests.regression;

import com.demoblaze.base.BaseClass;
import com.demoblaze.pageobjects.HomePage;
import org.testng.annotations.Test;

public class Carousel_slider extends BaseClass {
    @Test
    public void verify_carousel_is_working() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.carousel_slide();
    }
}

