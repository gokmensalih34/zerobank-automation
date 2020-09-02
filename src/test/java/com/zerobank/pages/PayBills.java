package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBills extends BasePage{

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




}
