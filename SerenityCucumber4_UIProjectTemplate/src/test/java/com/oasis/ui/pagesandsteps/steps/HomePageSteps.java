package com.oasis.ui.pagesandsteps.steps;

import com.oasis.ui.pagesandsteps.pages.HomePage1;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class HomePageSteps extends PageObject {
    HomePage1 homePage1;

    @Step
    public void openApplication() {
        open();
    }

    @Step
    public void enterUsername(String username) {
        element(homePage1.userName).type(username);
    }

    @Step
    public void enterPassword(String password) {
        element(homePage1.passWord).type(password);
    }

    @Step
    public void clickOnLoginButton() {
        element(homePage1.loginButton).click();
    }

    @Step
    public void loginToApplication() throws Exception {
        try {
            element(homePage1.userName).type("Admin");
            element(homePage1.passWord).type("admin123");
            element(homePage1.loginButton).click();
        } catch (Exception e) {
            throw new Exception("ERROR: While Clicking on Login button");
        }
    }
}
