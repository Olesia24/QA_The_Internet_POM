package com.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage extends BasePage{
    public CheckboxPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input:nth-child(1)")
    WebElement check1;
    @FindBy(css = "input[type='checkbox']:checked")
    WebElement check2;
    public CheckboxPage clickOnCheckbox() {
        if (check2.isSelected()) {
            check1.click();
        }
        return this;
    }
}
