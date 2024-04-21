package com.the_internet.tests;

import com.the_internet.pages.AlertsPage;
import com.the_internet.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new SidePanel(driver).selectJavaScriptAlerts();
    }
    @Test
    public void clickForJSAlertsTest(){
        new AlertsPage(driver).confirmAlert();
    }
    @Test
    public void clickForJSConfirm(){
        new AlertsPage(driver).selectResult("Cancel").verifyResult("Cancel");
    }
    @Test
    public void sendMessageToAlertTest(){
        new AlertsPage(driver).sendMessageToAlert("Hello World!").verifyMessage("Hello World!");
    }
}
