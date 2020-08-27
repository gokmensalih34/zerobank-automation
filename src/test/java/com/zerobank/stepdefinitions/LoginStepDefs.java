package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user enter credentials")
    public void the_user_enter_credentials() {
        String username = ConfigurationReader.get("userName");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage =new LoginPage();
        loginPage.login(username,password);
    }

    @Then("account summary page should be displayed")
    public void account_summary_page_should_be_displayed() {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Verify Title","Zero - Account Summary", actualTitle);

    }


    @When("the user enter wrong credentials")
    public void the_user_enter_wrong_credentials() {

        String wrongUserName = ConfigurationReader.get("wrongUserName");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage =new LoginPage();
        loginPage.loginWithWrongCredentials(wrongUserName,password);
    }


    @Then("the user should see error message")
    public void the_user_should_see_error_message() {

        LoginPage loginPage =new LoginPage();

        String actual = loginPage.errorMessage.getAttribute("innerHTML");
        String expected = "Login and/or password are wrong.";

        Assert.assertEquals(expected,actual.trim());
    }



}
