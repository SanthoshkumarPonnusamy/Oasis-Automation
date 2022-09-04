package com.oasis.ui.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage2 extends PageObject {

    By userName = By.id("txtUsername");
    By password = By.id("txtPassword");
    By loginButton = By.id("btnLogin");

    @Step
    public void loginToApplication() throws Exception {
        try{
            element(userName).type("Admin");
            element(password).type("admin123");
            element(loginButton).click();
        }catch (Exception e){
            throw new Exception("ERROR: While Clicking on Login button");
        }
    }
}
