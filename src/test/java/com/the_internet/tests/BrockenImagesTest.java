package com.the_internet.tests;

import com.the_internet.pages.BrockenImagesPage;
import com.the_internet.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrockenImagesTest extends TestBase{
    @BeforeMethod
    public void preconditions(){
        new SidePanel(driver).selectBrockenImages();
    }
    @Test
    public void checkBrokenImagesTest(){
        new BrockenImagesPage(driver).checkBrokenImages();
    }
}
