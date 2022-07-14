package com.vytrack.library.pages;

import com.vytrack.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US6_Page {

    @FindBy(xpath = "//span[normalize-space(.)='Fleet']")
    public WebElement fleetBtn;

    @FindBy(xpath = "//span[normalize-space(.)='Vehicle Costs']")
    public WebElement vehicleCostBtn;

    @FindBy(xpath = "(//div[@data-toggle=\"dropdown\"]/h1)")
    public WebElement allVehicleCostBtn;

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement titleDashboard;

    public US6_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
