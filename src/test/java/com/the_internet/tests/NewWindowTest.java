package com.the_internet.tests;

import com.the_internet.pages.NewWindowPage;
import com.the_internet.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewWindowTest extends TestBase {
    @BeforeMethod
    public void preconditions(){
        new SidePanel(driver).selectMultipleWindows();
    }
    @Test
    public void newWindowTest(){
        new NewWindowPage(driver).switchToNextWindow(1).verifyWindowMessage("New Window");
    }
}
