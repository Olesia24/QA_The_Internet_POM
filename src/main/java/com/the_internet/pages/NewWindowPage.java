package com.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NewWindowPage extends BasePage{
    public NewWindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/windows/new']")
    WebElement clickHere;

    public NewWindowPage switchToNextWindow(int index) {
        click(clickHere);

        List<String>windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return this;
    }

    @FindBy(css ="h3")
    WebElement sampleHeading;
    public BasePage verifyWindowMessage(String text) {
        Assert.assertTrue(shouldHaveText(sampleHeading, text, 10));
        return this;
    }
}
