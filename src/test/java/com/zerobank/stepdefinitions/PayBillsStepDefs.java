package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.PayBills;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class PayBillsStepDefs {

    @When("the user accesses the {string} tab")
    public void the_user_accesses_the_tab(String expectedPageTitle) {
        if (expectedPageTitle.equals("Account Activity")) {
            new AccountSummaryPage().accountActivityPageLink.click();
        }
        if (expectedPageTitle.equals("Pay Bills")) {
            new AccountSummaryPage().payBillsLink.click();
        }
    }

    @When("the user choose payee {string}")
    public void the_user_choose_payee(String payee) {
//        WebElement dropdownElement = Driver.get().findElement(By.cssSelector("select#sp_payee"));
        Select payeeOptions = new Select(new PayBills().payeeDropdown);
        payeeOptions.selectByVisibleText(payee);

//        List<String> payeeOptions = BrowserUtils.getElementsText(new PayBills().savedPayeeOptions);
//        Select payeeOptions= new Select();
//        System.out.println("payeeOptions = " + payeeOptions);
//        for (String payeeOption : payeeOptions) {
//            System.out.println(payeeOption);

    }


    @When("the user choose  Account {string}")
    public void the_user_choose_Account(String accountType) {

//        WebElement dropdownElement = Driver.get().findElement(By.cssSelector("select#sp_account"));
//        Select account = new Select(dropdownElement);
        Select account = new Select(new PayBills().payeeAccountDropdown);
        account.selectByVisibleText(accountType);


    }

    @When("the user enters amount {string}")
    public void the_user_enters_amount(String amount) {
//        String value = amount.replaceAll("([a-zA-Z])","");
        new PayBills().savedPayeeAmount.sendKeys(amount);
    }

    @When("the user enter date {string}")
    public void the_user_enter_date(String date) {

        new PayBills().savedPayeeDate.sendKeys(date);
    }

    @When("the user enter description {string}")
    public void the_user_enter_description(String description) {
        new PayBills().spDescription.sendKeys(description);
    }

    @When("the user clicks on Pay button")
    public void the_user_clicks_on_Pay_button() {

        new PayBills().savedPayeePay.click();
    }

    @Then("the user should see {string}")
    public void theUserShouldSee(String expectedMessage) {
        String actualMessage = new PayBills().messageForSuccesfullPayment.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals("Success message",expectedMessage,actualMessage);
        BrowserUtils.waitFor(5);
    }
}




