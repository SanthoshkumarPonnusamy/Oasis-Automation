package com.oasis.ui.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class HomePage1 extends PageObject {

    @FindBy(id="txtUsername")
    WebElementFacade userName;

    @FindBy(id="txtPassword")
    WebElementFacade password;

    @FindBy(id="btnLogin")
    WebElementFacade loginButton;

    @Step
    public void loginToApplication() throws Exception {
        try{
            userName.type("Admin");
            password.type("admin123");
            loginButton.click();
        }catch (Exception e){
            throw new Exception("ERROR: While Clicking on Login button");
        }
    }
}
