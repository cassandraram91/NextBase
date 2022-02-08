package com.nextbase.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json" //generate json execution report to be used for html report
        },
        features = "src/test/resources/features",
        glue = "com/nextbase/step_definitions",
        dryRun = true
        //tags = "@login"

)
public class TestRunner {

}
