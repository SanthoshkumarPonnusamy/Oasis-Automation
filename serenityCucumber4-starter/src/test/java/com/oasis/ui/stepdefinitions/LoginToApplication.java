package com.oasis.ui.stepdefinitions;

import com.oasis.ui.pages.Home;
import com.oasis.ui.utilities.TestDataHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginToApplication {
    TestDataHelper testDoc = new TestDataHelper();

    @Steps
    Home orangeHRMHomePageonee;

    @Given("user is on home page")
    public void user_is_on_home_page() {
        orangeHRMHomePageonee.openApplication();
    }

    @When("user enter valid userName")
    public void user_enter_valid_username() throws Exception {
        orangeHRMHomePageonee.enterUsername(testDoc.getData().get("UserName"));
    }

    @When("user enter valid password")
    public void user_enter_valid_password() throws Exception {
        orangeHRMHomePageonee.enterPassword(testDoc.getData().get("Password"));
        orangeHRMHomePageonee.clickOnLoginButton();
    }
}
