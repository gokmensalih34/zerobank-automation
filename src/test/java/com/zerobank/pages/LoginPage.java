package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends  BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css="input#user_login")
    public WebElement userName;

    @FindBy(css = "input#user_password")
    public WebElement password;

    @FindBy(css = "input[type='submit']")
    public WebElement submit;

    @FindBy(css = "div[class='alert alert-error']")
    public WebElement errorMessage;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr, Keys.ENTER);

        // verification that we logged
    }

    public void loginWithWrongCredentials(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr, Keys.ENTER);

        // verification that we logged
    }



}