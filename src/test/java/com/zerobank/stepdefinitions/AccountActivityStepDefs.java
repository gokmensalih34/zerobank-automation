package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class AccountActivityStepDefs {

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedPageTitle) {

        String actualPageTitle = Driver.get().getTitle();
        System.out.println("pageTitle = " + actualPageTitle);

        Assert.assertEquals("Verify Page Title", expectedPageTitle,actualPageTitle);
    }

    @Then("the Account drop down default option should be {string}")
    public void the_Account_drop_down_default_option_should_be(String expectedDefaultOption) {

        Select option = new Select(new AccountActivityPage().account);

//        Select Class yardimiyla olusturulan "option" WebElementlerininin elde edilmesi ve
//        Stringe dönüstürülüp yazdirilmasi calismasi
//        -------------
//        List<WebElement> options = option.getOptions();
//        List<String> opts = new ArrayList<>();
//        for (WebElement element : options) {
//            opts.add(element.getText());
//        }
//        System.out.println("opts = " + opts);
//        ---------

        String actualDefaultOption = option.getFirstSelectedOption().getText();
        System.out.println("actualDefaultOption = " + actualDefaultOption);
        Assert.assertEquals("Verify default account option in Account Activity", actualDefaultOption,expectedDefaultOption);

//        Asagidaki sekilde de test geciyor.
//        Dropdown Eleman ile ilgili iyi bir calisma oldu. Ama POM icin uygun bir cözüm tarzi degil.
//        -------------------------------
//        WebElement dropdownElement = Driver.get().findElement(By.cssSelector("select#aa_accountId"));
//        Select accountOptions = new Select(dropdownElement);
//        String actualDefaultOption = accountOptions.getFirstSelectedOption().getText();
//        System.out.println("actualDefaultOption = " + actualDefaultOption);
//
//        Assert.assertEquals("Verify default option", expectedDefaultOption,actualDefaultOption);
    }

    @Then("Account drop down should have the following options")
    public void account_drop_down_should_have_the_following_options(List<String> expectedAccountOptions) {

        List<String> actualAccountOptions = BrowserUtils.getElementsText(new AccountActivityPage().accountOptions);
        Assert.assertEquals(expectedAccountOptions,actualAccountOptions);

//        Asagidaki sekilde de test geciyor.
//        Dropdown Eleman ile ilgili iyi bir calisma oldu. Ama POM icin uygun bir cözüm tarzi degil.
//        Dropdown WebElement'i locate yap - Option Class'a ata - List<WebEleman>'a dönüstür - List<String>'e dönüstür - Assert yap
//        -------------------------------
//        WebElement dropdownElement = Driver.get().findElement(By.cssSelector("select#aa_accountId"));
//        Select accountOptions = new Select(dropdownElement);
//
//        List<WebElement> actualAccountOptions = accountOptions.getOptions();
//
//        List<String> strList = new ArrayList<>();
//
//        for (WebElement actualAccountOption : actualAccountOptions) {
//            strList.add(actualAccountOption.getText());
//        }
//
//        Assert.assertEquals(expectedAccountOptions, strList);

    }

    @Then("Transactions table should have column following names")
    public void transactions_table_should_have_column_following_names(List<String> expectedColumnNames) {

        List<String> actualColumnNames = BrowserUtils.getElementsText(new AccountActivityPage().tableColumnNames);
        Assert.assertEquals("Verify Transaction Column Names", expectedColumnNames,actualColumnNames);
        System.out.println("actualColumnNames = " + actualColumnNames);

//        Asagidaki sekilde de test geciyor.
//        List<WebEleman> ile ilgili iyi bir calisma oldu. Ama POM icin uygun bir cözüm tarzi degil.
//        List<WebEleman>'i locate yap - List<WebEleman>'for döngüsü ve getText ile dönüstür - List<String>'e dönüstür - Assert yap
//        -------------------------------
//        List<WebElement> colHeaders = Driver.get().findElements(By.xpath("//div[@id='all_transactions_for_account']//thead//th"));
//        List<String> cN = new ArrayList<>();
//        for (WebElement colHeader : colHeaders) {
//            System.out.println(cN.add(colHeader.getText()));
//        }
//        Assert.assertEquals(expectedColumnNames,cN);

    }


}
