package com.oasis.ui.stepdefinitions;

import com.oasis.ui.pages.HomePage2;
import com.oasis.ui.utilities.TestDataHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LoginToApplication {
    TestDataHelper testDoc = new TestDataHelper();

    private static final Logger LOGGER = LogManager.getLogger(LoginToApplication.class);


    @Steps
    HomePage2 homePageSteps;

    @Given("user is on home page")
    public void user_is_on_home_page() {
        homePageSteps.openApplication();
        LOGGER.info("**************  user_is_on_home_page  ************");
    }

    @When("user enter valid userName")
    public void user_enter_valid_username() throws Exception {
        homePageSteps.enterUsername(testDoc.getData().get("UserName"));
    }

    @When("user enter valid password")
    public void user_enter_valid_password() throws Exception {
        homePageSteps.enterPassword(testDoc.getData().get("Password"));
        homePageSteps.clickOnLoginButton();
    }
}
