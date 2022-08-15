package com.oasis.ui.pages;

import com.oasis.ui.pages.page.OrangeHRM_DashboardPage;
import net.thucydides.core.annotations.Step;

public class Dashboard {

    OrangeHRM_DashboardPage dashboardPage;

    @Step
    public void verifyAdmin(){
        dashboardPage.LoginVerified();
    }
}
