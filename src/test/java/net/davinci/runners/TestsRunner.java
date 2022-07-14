package net.davinci.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        },

        features = "src/test/resources/features",
        glue = "net/davinci/step_defs",
        dryRun = false,
        tags = ""
)

public class TestsRunner {
}
