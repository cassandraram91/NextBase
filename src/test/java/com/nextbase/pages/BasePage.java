package com.nextbase.pages;

import com.nextbase.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;

    BasePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
