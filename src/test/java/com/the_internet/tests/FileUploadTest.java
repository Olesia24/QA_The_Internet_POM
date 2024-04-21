package com.the_internet.tests;

import com.the_internet.pages.FileUploadPage;
import com.the_internet.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new SidePanel(driver).selectFileUpload();
    }
    @Test
    public void uploadFile(){
        new FileUploadPage(driver).upload("/Users/olesiavoprykova/Tools/foto.jpeg");
    }

}
