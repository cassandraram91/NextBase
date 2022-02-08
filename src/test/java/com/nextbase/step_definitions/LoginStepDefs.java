package com.nextbase.step_definitions;

import com.nextbase.pages.DashboardPage;
import com.nextbase.pages.LoginPage;
import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginStepDefs {

    LoginPage loginPg = new LoginPage();


    @Given("user is on login home page")
    public void user_is_on_login_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nextbasecrm.url"));
    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
        loginPg.loginField.sendKeys(ConfigurationReader.getProperty("username.hr"));
    }

    @And("user enters valid password")
    public void user_enters_valid_password() {
        loginPg.passwdField.sendKeys(ConfigurationReader.getProperty("password.hr"));
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginPg.loginBtn.click();
    }

    WebDriver driver;
    @Then("user successfully logins to application")
    public void user_successfully_logins_to_application() {
        DashboardPage dashPage = new DashboardPage();

        Assert.assertEquals("Site map", dashPage.pageTitle.getText());
    }


}
