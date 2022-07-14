package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://qa2.vytrack.com/user/login
public class LoginPage {

    @FindBy(xpath = "//*[@id='prependedInput']")
    public WebElement usernameInput;

    @FindBy(xpath = "//*[@id='prependedInput2']")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@id='_submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//span[normalize-space(.)='Fleet']")
    public WebElement fleetBtn;

    @FindBy(xpath = "//span[normalize-space(.)='Vehicle Costs']")
    public WebElement vehicleCostBtn;

    @FindBy(xpath = "(//div[@data-toggle=\"dropdown\"]/h1)")
    public WebElement allVehicleCostBtn;

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement titleDashboard;



    // No page elements added

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}