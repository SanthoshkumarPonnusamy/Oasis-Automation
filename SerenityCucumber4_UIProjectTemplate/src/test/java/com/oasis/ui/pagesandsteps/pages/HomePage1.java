package com.oasis.ui.pagesandsteps.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage1 extends PageObject {
    public By userName = By.name("username");
    public By passWord = By.name("password");
    public By loginButton = By.xpath("//button[@type='submit']");
}
