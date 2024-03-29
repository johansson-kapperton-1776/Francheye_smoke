package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/brand.feature",
		glue = "StepDefintions",
		plugin = {"pretty", "html:target/report.html"},
		dryRun = false
		)

public class testrunner {

}
