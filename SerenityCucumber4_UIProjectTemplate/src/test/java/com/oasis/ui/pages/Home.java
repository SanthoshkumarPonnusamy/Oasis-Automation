package com.oasis.ui.pages;

import com.oasis.ui.pages.page.OrangeHRM_HomePage;
import net.thucydides.core.annotations.Step;

public class Home {

    OrangeHRM_HomePage homePage;

    @Step
    public void openApplication(){
        homePage.open();
    }

    @Step
    public void enterUsername(String userName){
        homePage.enterUsername(userName);
    }

    @Step
    public void enterPassword(String password){
        homePage.enterPassword(password);
    }

    @Step
    public void clickOnLoginButton(){
        homePage.clickLoginButton();
    }
}
