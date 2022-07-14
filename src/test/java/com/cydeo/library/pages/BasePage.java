package com.cydeo.library.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = about:blank
public class BasePage {
    // No page elements added

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardLink;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement userLink;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksLink;

    @FindBy(id = "navbarDropdown")
    public WebElement userNameLink;
}