package com.oasis.ui.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPage2 extends PageObject {
    By dashboardKey = By.id("dbdKey");

    @Step
    public void verifyAdmin() {
        System.out.println(getDriver().getTitle());
    }
}
