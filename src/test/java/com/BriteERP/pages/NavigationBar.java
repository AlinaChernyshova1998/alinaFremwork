package com.BriteERP.pages;

import com.BriteERP.utilities.BrowserUtils;
import com.BriteERP.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class NavigationBar {
    public   NavigationBar(){
        PageFactory.initElements(Driver.get(), this);
    }
    public WebElement getTab(String tab){
        String tabXpath="//span[@class='oe_menu_text' and contains(text(),'"+tab+"')]";
        BrowserUtils.waitForPageToLoad(5);
        return  Driver.get().findElement(By.xpath((tabXpath)));
    }
    public void selectTab(String tab){
        WebElement tabEl=getTab(tab);
        BrowserUtils.waitForClickablility(tabEl,5).click();

    }
}
