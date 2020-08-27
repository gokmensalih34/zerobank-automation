package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {



    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    public WebElement username;


    @FindBy(id = "logout_link")
    public WebElement logOutLink;


    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    public String getUserName(){
        BrowserUtils.waitForVisibility(username, 5);
        return username.getText();
    }

    public void logOut(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(username);
        BrowserUtils.clickWithJS(logOutLink);
    }

}
