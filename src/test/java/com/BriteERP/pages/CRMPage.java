package com.BriteERP.pages;

import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMPage extends NavigationBar{
public  CRMPage(){
    PageFactory.initElements(Driver.get(), this);
}
@FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new' and contains(text(), 'Create')]")
    public WebElement createButton;
@FindBy(xpath = "//button[contains(text(),'Create')]")
public WebElement listViewCreateButton;

@FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import' and contains(text(), 'Import')]")
    public WebElement importButton;
@FindBy(xpath = "//button[@data-view-type='list']")
    public WebElement list;
    @FindBy(xpath = "//button[@data-view-type='kanban']")
    public WebElement kanban;
    @FindBy(xpath = "//button[@data-view-type='pivot']")
    public WebElement pivot;
    @FindBy(xpath = "//button[@data-view-type='graph']")
    public WebElement graph;
}
