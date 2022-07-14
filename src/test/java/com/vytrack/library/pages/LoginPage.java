package com.vytrack.library.pages;

import com.vytrack.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://qa2.vytrack.com/user/login
public class LoginPage {

    @FindBy(xpath = "//*[@id='prependedInput']")
    public WebElement usernameInput;

    @FindBy(xpath = "//*[@id='prependedInput2']")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@id='_submit']")
    public WebElement submitButton;

    // No page elements added

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}