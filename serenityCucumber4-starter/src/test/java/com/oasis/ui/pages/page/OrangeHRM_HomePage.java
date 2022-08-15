package com.oasis.ui.pages.page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrangeHRM_HomePage extends PageObject {

    public void enterUsername(String userName){
        $(By.id("txtUsername")).type(userName);
    }

    public void enterPassword(String password){
        $(By.id("txtPassword")).type(password);
    }

    public void clickLoginButton(){
        $(By.id("btnLogin")).click();
    }
}
