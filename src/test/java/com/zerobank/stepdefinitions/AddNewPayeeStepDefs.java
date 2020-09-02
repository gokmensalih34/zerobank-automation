package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.PayBills;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class AddNewPayeeStepDefs {

    @Given("Add New Payee tab")
    public void add_New_Payee_tab() {

        BrowserUtils.waitFor(1);
        new AccountSummaryPage().payBillsLink.click();

        BrowserUtils.waitFor(1);
        new PayBills().addNewPayee.click();
        BrowserUtils.waitFor(1);

    }

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String> userInfo) {

        System.out.println("userInfo = " + userInfo);

        new PayBills().payeeName.sendKeys("The Law Offices of Hyde, Price & Scharks");
        new PayBills().payeeAddress.sendKeys("100 Same st, Anytown, USA, 10001");
        new PayBills().payeeAccount.sendKeys("Checking");
        new PayBills().payeeDetails.sendKeys("XYZ account");
        BrowserUtils.waitFor(1);
        new PayBills().addButton.click();

    }

    @Then("message The new payee The Law Offices of Hyde, Price & Scharks was successfully created. should be displayed")
    public void message_The_new_payee_The_Law_Offices_of_Hyde_Price_Scharks_was_successfully_created_should_be_displayed() {

        String expected = "The new payee The Law Offices of Hyde, Price & Scharks was successfully created.";
        String actual = new PayBills().message.getText();
        System.out.println("actual = " + actual);

        Assert.assertEquals("Expected message is written correctly", expected,actual);
        BrowserUtils.waitFor(1);
    }
}
