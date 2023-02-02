package com.sandikurnia.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/cucumberTestReportLogin.json",
                "html:target/cucumber-reports/TestReportLogin.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "/Users/sandikurnia/Documents/QualityAssurance_SandiKurnia/src/test/resources/features/login.feature",
        glue = {"com/sandikurnia/stepDef"},
        monochrome = true,
        dryRun = false,
        tags = "@Login-Feature"
)

public class testRunnerLogin extends AbstractTestNGCucumberTests {

}
