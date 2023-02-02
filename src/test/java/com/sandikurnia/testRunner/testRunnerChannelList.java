package com.sandikurnia.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/cucumberTestReportChannelList.json",
                "html:target/cucumber-reports/TestReportChannelList.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "/Users/sandikurnia/Documents/QualityAssurance_SandiKurnia/src/test/resources/features",
        glue = {"com/sandikurnia/stepDef"},
        monochrome = true,
        dryRun = false,
        tags = "@Channel_List-Feature"
)
public class testRunnerChannelList extends AbstractTestNGCucumberTests {
}
