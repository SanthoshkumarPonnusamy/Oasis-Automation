package com.oasis.ui.testsuites;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@Regression", //  To run specific set of testcases
        plugin = {"pretty"},
        features = "src/test/resources/features", // If required we can match each feature file with class file
        dryRun = true, //generate the step definition
        glue = "com.oasis.ui.stepdefinitions")
public class RegressionTestSuite {

}
