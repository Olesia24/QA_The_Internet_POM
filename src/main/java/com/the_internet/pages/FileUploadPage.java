package com.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement fileUpload;
    @FindBy(id = "file-submit")
    WebElement submitUpload;
    public FileUploadPage upload(String path) {
        fileUpload.sendKeys(path);
        click(submitUpload);
        return this;
    }
}
