package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDef {


    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("storemanager1"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.submitButton.click();
    }

    @When("the user clicks on the Vehicle Costs button")
    public void the_user_clicks_on_the_vehicle_costs_button(){

        loginPage.vehicleCostBtn.click();
    }
    @Then("the user should be able to see the Vehicle Costs page")
    public void the_user_should_be_able_to_see_the_vehicle_costs_page() {
        String actual = loginPage.titleDashboard.getText();
        String expected = "All Vehicle Costs";
        Assert.assertEquals(actual,expected);
    }
}
