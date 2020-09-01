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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.List;

import static java.lang.Float.parseFloat;

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
        new AccountActivityPage().fromDate.clear();
        new AccountActivityPage().fromDate.sendKeys(fromDate);
        BrowserUtils.waitFor(1);
        new AccountActivityPage().toDate.clear();
        new AccountActivityPage().toDate.sendKeys(toDate);
        BrowserUtils.waitFor(2);

    }

    @When("clicks search")
    public void clicks_search() {
        BrowserUtils.waitFor(2);
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
        new AccountActivityPage().description.clear();
        new AccountActivityPage().description.sendKeys(str);
    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String description) {
        System.out.println(BrowserUtils.getElementsText(new AccountActivityPage().online));
        List<String> online = BrowserUtils.getElementsText(new AccountActivityPage().online);

        System.out.println("description = " + description);
        for (int i=0; i<online.size(); i++){
            BrowserUtils.waitFor(1);
            System.out.println(online.get(i));
            Assert.assertTrue(online.get(i).contains(description));
        }

    }

//    @Then("results table should not show descriptions containing {string}")
//    public void results_table_should_not_show_descriptions_containing(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

    // NEWLY ADDED METHODS FOR SCENARIO:TYPE

    @Then("results table should show at least one result under Deposit")
    public void results_table_should_show_at_least_one_result_under_Deposit() {
//        System.out.println(BrowserUtils.getElementsText(new AccountActivityPage().deposit));
        List<String> depositValue = BrowserUtils.getElementsText(new AccountActivityPage().deposit);
//        System.out.println("d= " +  depositValue.get(1));
        int countDeposit = 0;
        for (String s : depositValue) {
            if (s.equals("")) {
                countDeposit = countDeposit;
            }else {
                countDeposit = countDeposit+1;
//                System.out.println(parseFloat(s));
            }

        }
        System.out.println("countDeposit = " + countDeposit);
        Assert.assertTrue("Results table shows at least one result under Deposit",countDeposit>=1);
    }

    @Then("results table should show at least one result under Withdrawal")
    public void results_table_should_show_at_least_one_result_under_Withdrawal() {
        List<String> withdrawalResults = BrowserUtils.getElementsText(new AccountActivityPage().withdrawal);
        int countWithdrawal = 0;
        for (String withdrawalResult : withdrawalResults) {
            if (withdrawalResult.equals("")) {
                countWithdrawal = countWithdrawal;
            } else {
                countWithdrawal = countWithdrawal+1;
            }
        }
        System.out.println("countWithdrawal = " + countWithdrawal);
        Assert.assertTrue("Results table shows at least one result under Withdrawal", countWithdrawal>=1 );
    }

    @When("user selects type {string}")
    public void user_selects_type(String type) {

        BrowserUtils.getDropdownElement().selectByVisibleText(type);
        BrowserUtils.waitFor(1);

        new AccountActivityPage().find.click();
        BrowserUtils.waitFor(1);
    }

    @Then("results table should show no result under Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal() {

        List<String> withdrawalResults2 = BrowserUtils.getElementsText(new AccountActivityPage().withdrawal);
        int countWithdrawal2=0;
        for (String withdrawalResult2 : withdrawalResults2) {
            if(withdrawalResult2.equals("")) {
                countWithdrawal2=countWithdrawal2;
            } else{
                countWithdrawal2=countWithdrawal2+1;
            }

        }
        System.out.println("countWithdrawal2 = " + countWithdrawal2);
        Assert.assertTrue("No result under Withdrawal is displayed",  countWithdrawal2==0);
    }

    @Then("results table should show no result under Deposit")
    public void results_table_should_show_no_result_under_Deposit() {
        List<String> depositResultsUnderTypeWithdrawal = BrowserUtils.getElementsText(new AccountActivityPage().deposit);

        int countdepositResult2 = 0;
        for (String depositResult2 : depositResultsUnderTypeWithdrawal) {
            if (depositResult2.equals("")) {
                countdepositResult2=countdepositResult2;
            } else {
                countdepositResult2=countdepositResult2+1;
            }
            System.out.println("countdepositResult2 = " + countdepositResult2);
            Assert.assertTrue("No result under Deposit is displayed", countdepositResult2==0);

        }
    }








}
