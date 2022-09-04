package com.oasis.ui.testsuites;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@Regression",
        plugin = {"pretty"},
        features = "src/test/resources/Features/com.oasis.ui.features.hrm",
        glue = "com.oasis.ui.stepdefinitions")
public class RegressionTestSuite {

}
