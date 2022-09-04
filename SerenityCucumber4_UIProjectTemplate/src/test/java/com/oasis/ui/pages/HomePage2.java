package com.oasis.ui.pages;

import com.oasis.ui.stepdefinitions.LoginToApplication;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class HomePage2 extends PageObject {

    private static final Logger LOGGER = LogManager.getLogger(HomePage2.class);

    By userName = By.name("username");
    By passWord = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");

    @Step
    public void openApplication() {
        open();
        LOGGER.info("**************  Opening HRM Home Page  ************");
    }

    @Step
    public void enterUsername(String username) {
        element(userName).type(username);
        LOGGER.info("**************  Entering HRM Username  ************");
    }

    @Step
    public void enterPassword(String password) {
        element(passWord).type(password);
        LOGGER.info("**************  Entering HRM Password  ************");
    }

    @Step
    public void clickOnLoginButton() {
        element(loginButton).click();
        LOGGER.info("**************  Clicking on Login Button  ************");
    }

    @Step
    public void loginToApplication() throws Exception {
        try {
            element(userName).type("Admin");
            element(passWord).type("admin123");
            element(loginButton).click();
        } catch (Exception e) {
            throw new Exception("ERROR: While Clicking on Login button");
        }
    }
}
