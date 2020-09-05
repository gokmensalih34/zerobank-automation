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

        Select select = new Select(new PayBills().pcCurrency);
        List<WebElement> options = select.getOptions();
        List<String> actualCurrencies = BrowserUtils.getElementsText(options);

//        List<String> actualCurrencies = BrowserUtils.getElementsText(new PayBills().currencies);
//        actualCurrencies.remove(0);
        System.out.println("actualCurrencies = " + actualCurrencies);

        System.out.println("expectedCurrencies = " + expectedCurrencies);
//        Assert.assertEquals("Currencies are available", expectedCurrencies,actualCurrencies);
//        Assert.assertTrue("Currencies are available", expectedCurrencies.contains(actualCurrencies));
        for (String expectedCurrency : expectedCurrencies) {
            Assert.assertTrue("Currencies are available", actualCurrencies.contains(expectedCurrency));
        }

    }


    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {

        PayBills payBills = new PayBills();

        payBills.amount.sendKeys("500");
        payBills.radioButtonUSDollar.click();
        payBills.calculateCostsButton.click();
        BrowserUtils.waitFor(2);
    }


    @Then("error message {string} should be displayed")
    public void errorMessageShouldBeDisplayed(String expectedAlertMessage) {

        Alert alert = Driver.get().switchTo().alert();
        String actualAlertText = alert.getText();
        System.out.println("actualAlertText = " + actualAlertText);
        Assert.assertEquals("Error alert message", expectedAlertMessage,actualAlertText);
        BrowserUtils.waitFor(2);

    }



    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {

        Select select = new Select(new PayBills().pcCurrency);

//        List<WebElement> options = select.getOptions();
//        List<String> elementsText = BrowserUtils.getElementsText(options);


//            BrowserUtils.waitFor(1);
            select.selectByIndex(1);
//            BrowserUtils.waitFor(1);

            new PayBills().radioButtonUSDollar.click();
//            BrowserUtils.waitFor(1);

            new PayBills().calculateCostsButton.click();
            BrowserUtils.waitFor(2);


    }


}
