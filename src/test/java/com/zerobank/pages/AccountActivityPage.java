package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(xpath = "//select[@id='aa_accountId']/option[1]")
    public WebElement optionSaving;

    @FindBy(xpath = "//a[.='Account Activity']")
    public WebElement accountActivity;

    @FindBy(xpath = "//select[@id='aa_accountId']/option[6]")
    public WebElement optionBrokerage;

    @FindBy(xpath = "//select[@id='aa_accountId']/option[2]")
    public WebElement optionChecking;

    @FindBy(xpath = "//select[@id='aa_accountId']/option[5]")
    public WebElement optionCreditCard;

    @FindBy(xpath = "//select[@id='aa_accountId']/option[4]")
    public WebElement optionLoan;

    @FindBy(xpath = "//a[.='Find Transactions']")
    public WebElement findTransactions;

    @FindBy(xpath = "//input[@name='fromDate']")
    public WebElement fromDate;

    @FindBy(css = "input[name=toDate]")
    public WebElement toDate;

    @FindBy(css = "button[type=submit]")
    public  WebElement find;



    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//tbody//td[2]")
    public List<WebElement> online;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//tbody//td[2]")
    public List<WebElement> office;


    @FindBy(css = "input[name=description]")
    public WebElement description;



}
