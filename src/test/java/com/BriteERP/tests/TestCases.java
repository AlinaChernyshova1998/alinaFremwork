package com.BriteERP.tests;

import com.BriteERP.pages.CRMPage;
import com.BriteERP.pages.LoginPage;
import com.BriteERP.utilities.BrowserUtils;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases extends TestBase {
    @BeforeMethod
    public void setUp() {
        driver.get(ConfigurationReader.get("url"));
    }

    @Test
    public void test1() throws InterruptedException {
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

        CRMPage crmPage = new CRMPage();
        BrowserUtils.waitForClickablility(crmPage.getTab("CRM"), 2).click();

        BrowserUtils.waitForClickablility(crmPage.list, 3).click();
        BrowserUtils.waitFor(3);
        crmPage.listViewCreateButton.click();
        BrowserUtils.waitFor(5);
        driver.findElement(By.xpath("//input[@class='o_field_char o_field_widget o_input o_required_modifier']")).sendKeys("alina_love");
        WebElement revenue = driver.findElement(By.xpath("//input[@class='o_input']"));
        revenue.click();

        driver.findElement(By.xpath("//div//input[@class='o_input']")).clear();
        driver.findElement(By.xpath("//div//input[@class='o_input']")).sendKeys("43333");

        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm o_form_button_save']")).click();

    }

    @Test
    public void test2() {
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

        CRMPage crmPage = new CRMPage();
        BrowserUtils.waitForClickablility(crmPage.getTab("CRM"), 2).click();

        BrowserUtils.waitForClickablility(crmPage.list, 5).click();
        BrowserUtils.waitFor(3);
        driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
        driver.findElement(By.xpath("//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle' and contains (text(), 'Action')]")).click();
        driver.findElement(By.xpath("//a[contains (text(), 'Delete')]")).click();
        BrowserUtils.waitFor(5);
       driver.findElement(By.xpath("//span[contains (text(), 'Ok')]")).click();
    }
}
