package com.vytrack.library.pages;

import com.vytrack.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://qa2.vytrack.com/user/login



// ************* do not make any changes to this file ******************
public class LoginPage {

    @FindBy(xpath = "//input[@name='_username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='_password']")
    public WebElement passwordInput;

    @FindBy(xpath = "_submit")
    public WebElement submitButton;

    // No page elements added

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}