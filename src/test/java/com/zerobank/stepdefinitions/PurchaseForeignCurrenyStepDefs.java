package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.PayBills;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class PurchaseForeignCurrenyStepDefs {

    @Given("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {
        new AccountSummaryPage().payBillsLink.click();
        new PayBills().purchaseForeignCurrencyLink.click();
        BrowserUtils.waitFor(2);

    }

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> expectedCurrencies) {

        List<String> actualCurrencies = BrowserUtils.getElementsText(new PayBills().currencies);
        Assert.assertEquals("Currencies are available", expectedCurrencies,actualCurrencies);
    }


    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {

        new PayBills().amount.sendKeys("500");
        new PayBills().radioButtonUSDollar.click();
        new PayBills().calculateCostsButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {

        Alert alert = Driver.get().switchTo().alert();
        String actualAlertText = alert.getText();
        System.out.println("actualAlertText = " + actualAlertText);
        String expectedAlertMessage = "Please, ensure that you have filled all the required fields with valid values.";
        Assert.assertEquals("Error alert message", expectedAlertMessage,actualAlertText);
        BrowserUtils.waitFor(2);
    }

    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {

        WebElement dropdownElement = Driver.get().findElement(By.cssSelector("select#pc_currency"));
        Select currencyDropdown = new Select(dropdownElement);

//        List<WebElement> actualCurrencies =currencyDropdown.getOptions();
//        System.out.println("actualCurrencies.size() = " + actualCurrencies.size());


//            BrowserUtils.waitFor(1);
            currencyDropdown.selectByIndex(1);
//            BrowserUtils.waitFor(1);

            new PayBills().radioButtonUSDollar.click();
//            BrowserUtils.waitFor(1);

            new PayBills().calculateCostsButton.click();
            BrowserUtils.waitFor(2);


    }

}
