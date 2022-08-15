package com.oasis.ui.stepdefinitions;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;


public class Dashboard {

    @Steps
    com.oasis.ui.pages.Dashboard dash;

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        dash.verifyAdmin();
    }
}
