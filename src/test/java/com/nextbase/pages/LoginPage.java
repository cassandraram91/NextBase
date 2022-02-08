package com.nextbase.pages;

import com.nextbase.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    //This is a login page for CRM

    @FindBy(name = "USER_LOGIN")
    public WebElement loginField;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwdField;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginBtn;


    public void validLogin(String user){
        LoginPage loginPage = new LoginPage();

        driver.get(ConfigurationReader.getProperty("nextbasecrm.url"));

        if(user.equalsIgnoreCase("hr")) {
            loginPage.loginField.sendKeys(ConfigurationReader.getProperty("username.hr"));
            loginPage.passwdField.sendKeys(ConfigurationReader.getProperty("password"));
            loginPage.loginBtn.click();

        }else if(user.equalsIgnoreCase("marketing")){
            loginPage.loginField.sendKeys(ConfigurationReader.getProperty("username.marketing"));
            loginPage.passwdField.sendKeys(ConfigurationReader.getProperty("password"));
            loginPage.loginBtn.click();

        }else if(user.equalsIgnoreCase("help desk")){
            loginPage.loginField.sendKeys(ConfigurationReader.getProperty("username.helpdsk"));
            loginPage.passwdField.sendKeys(ConfigurationReader.getProperty("password"));
            loginPage.loginBtn.click();

        }else{
            Assert.fail("Invalid user");
        }


    }
}
