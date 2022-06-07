package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/features/CreateLead1.feature",
		"src/test/java/features/DuplicateLead.feature", "src/test/java/features/EditLead.feature",
		"src/test/java/features/DeleteLead.feature",
		"src/test/java/features/MergeLead.feature" }, glue = "steps", monochrome = true, publish = true)
public class CucumberRunnerfor5TestCases extends AbstractTestNGCucumberTests {
}