package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.text.SimpleDateFormat;
import java.util.List;

public class FindTransactionsStepDefs {

//    METHODS FOR Scenario: Search date range

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {

        BrowserUtils.waitFor(1);
        new AccountActivityPage().findTransactions.click();

    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String fromDate, String toDate) {

        BrowserUtils.waitFor(1);
        new AccountActivityPage().fromDate.sendKeys(fromDate);
        BrowserUtils.waitFor(1);
        new AccountActivityPage().toDate.sendKeys(toDate);

    }

    @When("clicks search")
    public void clicks_search() {
        BrowserUtils.waitFor(1);
        new AccountActivityPage().find.click();
        BrowserUtils.waitFor(2);

    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String fromDate, String toDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();





    }
//
//    @Then("the results should be sorted by most recent date")
//    public void the_results_should_be_sorted_by_most_recent_date() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @When("clicks search results table should only show transactions dates between {string} to {string}")
//    public void clicks_search_results_table_should_only_show_transactions_dates_between_to (String fromDate, String toDate) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @When("the results table should only not contain transactions dated {string}")
//    public void the_results_table_should_only_not_contain_transactions_dated (String fromDate) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }


    // NEWLY ADDED METHODS FOR SCENARIO:SEARCH DESCRIPTION

    @When("the user enters description {string}")
    public void the_user_enters_description(String str) {
        BrowserUtils.waitFor(1);
        new AccountActivityPage().description.sendKeys(str);
    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String description) {
        System.out.println(BrowserUtils.getElementsText(new AccountActivityPage().online));
        List<String> online = BrowserUtils.getElementsText(new AccountActivityPage().online);

        for (int i=0; i<online.size(); i++){
            BrowserUtils.waitFor(1);
            System.out.println(online.get(i));
            Assert.assertTrue(online.get(i).contains(description));
        }

    }

    @When("the user enters description “OFFICE”")
    public void the_user_enters_description_OFFICE() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
