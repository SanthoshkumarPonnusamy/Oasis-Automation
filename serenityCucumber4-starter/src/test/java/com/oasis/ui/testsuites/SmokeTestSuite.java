package com.oasis.ui.testsuites;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@Smoke",
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "com.oasis.ui.stepdefinitions")
public class SmokeTestSuite {

}
