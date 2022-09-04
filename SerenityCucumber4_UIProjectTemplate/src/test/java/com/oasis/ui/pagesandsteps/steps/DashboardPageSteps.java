package com.oasis.ui.pagesandsteps.steps;

import com.oasis.ui.pagesandsteps.pages.DashboardPage1;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class DashboardPageSteps extends PageObject {
    DashboardPage1 dashboardPage1;

    @Step
    public void verifyAdmin() {
        System.out.println(getDriver().getTitle());
    }
}
