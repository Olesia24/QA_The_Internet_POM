package com.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SidePanel extends BasePage{
    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/javascript_alerts']")
    WebElement alerts;
    public AlertsPage selectJavaScriptAlerts() {
        click(alerts);
        return new AlertsPage(driver);
    }

    @FindBy(css = "[href*='/windows']")
    WebElement newWindow;
    public NewWindowPage selectMultipleWindows() {
        click(newWindow);
        return new NewWindowPage(driver);
    }

    @FindBy(css = "[href='/dropdown']")
    WebElement dropdown;

    public DropdownPage selectDropdown() {
        click(dropdown);
        return new DropdownPage(driver);
    }

    @FindBy(css = "[href='/checkboxes']")
    WebElement checkboxes;
    public CheckboxPage selectCheckboxes() {
        click(checkboxes);
        return new CheckboxPage(driver);
    }

    @FindBy(css = "[href='/upload']")
    WebElement fileUpload;
    public FileUploadPage selectFileUpload() {
        click(fileUpload);
        return new FileUploadPage(driver);
    }

    @FindBy(css = "[href='/broken_images']")
    WebElement brokenImages;
    public BrockenImagesPage selectBrockenImages() {
        click(brokenImages);
        return new BrockenImagesPage(driver);
    }

    @FindBy(css = "[href='/drag_and_drop']")
    WebElement dragAndDrop;
    public DragAndDropPage selectDragAndDrop() {
        click(dragAndDrop);
        return new DragAndDropPage(driver);
    }
}
