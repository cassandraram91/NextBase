package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(id = "pagetitle")
    public WebElement pageTitle;

    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBox;

}
