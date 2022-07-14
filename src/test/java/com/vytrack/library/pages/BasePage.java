package com.vytrack.library.pages;

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
}