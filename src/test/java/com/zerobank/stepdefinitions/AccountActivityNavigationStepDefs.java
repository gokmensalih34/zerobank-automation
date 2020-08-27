package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountActivityNavigationStepDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        String username = ConfigurationReader.get("userName");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage =new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        AccountSummaryPage accountSummary = new AccountSummaryPage();
        accountSummary.savings1.click();
    }

    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String expected) {

        String actual = new AccountActivityPage().accountActivity.getText();

        Assert.assertEquals(expected,actual);

    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String expectedOption) {

        if(expectedOption.contains("Savings")) {
            String actualOption = new AccountActivityPage().optionSaving.getText();
            System.out.println("option = " + actualOption);

            Assert.assertEquals("Account Type: Savings", expectedOption, actualOption);
        }

        if(expectedOption.contains("Brokerage")) {
            String actualOption = new AccountActivityPage().optionBrokerage.getText();
            System.out.println("option = " + actualOption);

            Assert.assertEquals("Account Type: Brokerage", expectedOption, actualOption);
        }

        if(expectedOption.contains("Checking")) {
            String actualOption = new AccountActivityPage().optionChecking.getText();
            System.out.println("option = " + actualOption);

            Assert.assertEquals("Account Type: Checking", expectedOption, actualOption);
        }

        if(expectedOption.contains("Credit Card")) {
            String actualOption = new AccountActivityPage().optionCreditCard.getText();
            System.out.println("option = " + actualOption);

            Assert.assertEquals("Account Type: Credit Card", expectedOption, actualOption);
        }

        if(expectedOption.contains("Loan")) {
            String actualOption = new AccountActivityPage().optionLoan.getText();
            System.out.println("option = " + actualOption);

            Assert.assertEquals("Account Type: Loan", expectedOption, actualOption);
        }
    }

    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        accountSummaryPage.brokerage.click();
    }

    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        accountSummaryPage.checking.click();

    }

    @When("the user clicks on Credit card link on the Account Summary page")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page() {
        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        accountSummaryPage.creditCard.click();
    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        new AccountSummaryPage().loan.click();
    }




}
