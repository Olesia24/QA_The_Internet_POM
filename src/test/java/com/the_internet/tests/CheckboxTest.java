package com.the_internet.tests;

import com.the_internet.pages.CheckboxPage;
import com.the_internet.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxTest extends TestBase {
    @BeforeMethod
    public void preconditions(){
        new SidePanel(driver).selectCheckboxes();
    }
    @Test
    public void clickOnCheckboxTest(){
        new CheckboxPage(driver).clickOnCheckbox();
    }
}
