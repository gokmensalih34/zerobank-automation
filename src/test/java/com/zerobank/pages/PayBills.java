package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PayBills extends BasePage{

// VARIABLES OF "Add New Payee" SUBMODULE

    @FindBy(linkText = "Add New Payee")
    public WebElement addNewPayee;

    @FindBy(xpath = "//input[@id='np_new_payee_name']")
    public WebElement payeeName;

    @FindBy(css = "textarea#np_new_payee_address")
    public WebElement payeeAddress;

    @FindBy(css = "input#np_new_payee_account")
    public WebElement payeeAccount;

    @FindBy(css = "input#np_new_payee_details")
    public WebElement payeeDetails;

    @FindBy(id = "add_new_payee")
    public WebElement addButton;

    @FindBy(css = "div#alert_content")
    public WebElement message;

    // VARIABLES OF "Purchase Foreign Currency" SUBMODULE

    @FindBy (xpath = "//a[.='Purchase Foreign Currency']")
    public WebElement purchaseForeignCurrencyLink;

    @FindBy(id = "pc_currency")
    public WebElement pcCurrency;

//    @FindBy (css = "select#pc_currency")
//    public List<WebElement> currencies;

    @FindBy(css = "select#pc_currency>option")
    public List<WebElement> currencyOptions;

    @FindBy (css = "input#pc_amount")
    public WebElement amount;

    @FindBy(id = "pc_inDollars_true")
    public WebElement radioButtonUSDollar;

    @FindBy(id = "pc_calculate_costs")
    public WebElement calculateCostsButton;

// VARIABLES OF "Pay Saved Payee" SUBMODULE

//    @FindBy(css = "select#sp_payee")
    @FindBy(id = "sp_payee")
    public WebElement payeeDropdown;

    @FindBy(id="sp_account")
    public WebElement payeeAccountDropdown;

    @FindBy(css = "input#sp_amount")
    public WebElement savedPayeeAmount;

    @FindBy(css = "input#sp_date")
    public WebElement savedPayeeDate;

    @FindBy(css = "input#sp_description")
    public WebElement spDescription;

    @FindBy(id = "pay_saved_payees")
    public WebElement savedPayeePay;

    @FindBy (css = "div#alert_content>span")
    public WebElement messageForSuccesfullPayment;


}
