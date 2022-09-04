package com.oasis.ui.stepdefinitions;

import com.oasis.ui.pages.DashboardPage2;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;


public class Dashboard {

    @Steps
    DashboardPage2 dashboardPageSteps;

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        dashboardPageSteps.verifyAdmin();
    }
}
