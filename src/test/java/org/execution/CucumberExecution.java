package org.execution;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature/testcase1.feature",
                 glue="org.stepdefinition",
                 format = {"pretty","html:target/cucumber-html-report"},
                 monochrome = true,
                 dryRun = false,
                 strict =false)
public class CucumberExecution {

}
