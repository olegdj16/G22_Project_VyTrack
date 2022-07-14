package com.vytrack.library.step_definitions;

import com.vytrack.library.pages.LoginPage;
import com.vytrack.library.pages.US6_Page;
import com.vytrack.library.utilities.ConfigurationReader;
import com.vytrack.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US6_S1_SalesManagerCanAccessVehicleCostsPageStepDef {


    LoginPage loginPage = new LoginPage();
    US6_Page us6_page = new US6_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("storemanager1"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.submitButton.click();
    }

    @When("the user hovers with the mouse over the Fleet button")
    public void theUserHoversWithTheMouseOverTheFleetButton() {
    }

    @When("the user clicks on the Vehicle Costs button")
    public void the_user_clicks_on_the_vehicle_costs_button(){

        us6_page.vehicleCostBtn.click();
    }

    @Then("the user should be able to see the Vehicle Costs page")
    public void the_user_should_be_able_to_see_the_vehicle_costs_page() {
        String actual = us6_page.titleDashboard.getText();
        String expected = "All Vehicle Costs";
        Assert.assertEquals(actual,expected);
    }
}
