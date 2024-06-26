package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",
glue = "stepDefination",
monochrome = true,plugin= {"pretty","html:target/cucumber-reports"},
dryRun = false,
tags="@tag23"
		)



public class TestRunner {

}
