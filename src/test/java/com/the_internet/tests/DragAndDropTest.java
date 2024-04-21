package com.the_internet.tests;

import com.the_internet.pages.DragAndDropPage;
import com.the_internet.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new SidePanel(driver).selectDragAndDrop();
    }
    @Test
    public void DragAndDropTest(){
        new DragAndDropPage(driver).dragElementA();
    }
}
