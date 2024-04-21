package com.the_internet.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li:nth-child(1) button")
    WebElement firstAlert;

    public AlertsPage confirmAlert() {
        click(firstAlert);
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        return this;
    }
    @FindBy(css = "li:nth-child(2) button")
    WebElement confirmButton;
    public AlertsPage selectResult(String confirm) {
        click(confirmButton);
        
        if (confirm != null && confirm.equals("OK")){
            driver.switchTo().alert().accept();
        } else if (confirm != null && confirm.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement confirmResult;
    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(confirmResult.getText().contains(text));
        return this;
    }
    @FindBy(css = "li:nth-child(3) button")
    WebElement promtButton;

    public AlertsPage sendMessageToAlert(String message) {
        click(promtButton);

        if (message != null){
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }
    @FindBy(id = "result")
    WebElement messageResult;

    public AlertsPage verifyMessage(String text) {
        Assert.assertTrue(messageResult.getText().contains(text));
        return this;
    }
}
