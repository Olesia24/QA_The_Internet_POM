package com.the_internet.tests;

import com.the_internet.pages.DropdownPage;
import com.the_internet.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new SidePanel(driver).selectDropdown();
    }
    @Test
    public void selectDropdownTest(){
        new DropdownPage(driver).selectOption("Option 2");
    }
}
