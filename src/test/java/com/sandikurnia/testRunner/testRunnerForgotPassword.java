package com.sandikurnia.testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/TestReportForgotPassword.json",
                "html:target/cucumber-reports/TestReportForgotPassword.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "/Users/sandikurnia/Documents/QualityAssurance_SandiKurnia/src/test/resources/features",
        glue = {"com/sandikurnia/stepDef"},
        monochrome = true,
        dryRun = false,
        tags = "@ForgotPassword-Feature"
)
public class testRunnerForgotPassword extends AbstractTestNGCucumberTests {
}
