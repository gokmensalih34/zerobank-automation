package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryPage extends BasePage{

    @FindBy(xpath = "(//a[.='Savings'])[1]")
    public WebElement savings1;

    @FindBy(xpath = "//a[.='Brokerage']")
    public WebElement brokerage;

    @FindBy(xpath = "//a[.='Checking']")
    public WebElement checking;

    @FindBy(xpath = "//a[.='Credit Card']")
    public WebElement creditCard;

    @FindBy(xpath = "//a[.='Loan']")
    public WebElement loan;

    @FindBy(linkText = "Pay Bills")
    public WebElement payBillsLink;



}
