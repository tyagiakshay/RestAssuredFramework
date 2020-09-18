package runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/", glue = { "src/test/java/stepDefinitions/" }, dryRun = true, tags = {}, monochrome = false, strict = false)
public class cucumberTestRunner {

}
