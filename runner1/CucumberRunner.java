package runner1;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features = { "src/test/java/features_1" }, glue = "steps", monochrome = true, publish = true,
// tags = "@functional"
// tags = "@sanity or @regression"
// tags = "@functional or @smoke"
// tags = "@sanity and @regression"
// tags = "@regression"
// tags = "@sanity"
// tags = "@smoke"
// tags = "@functional and @regression "
		tags = "@smoke and @sanity"

)
public class CucumberRunner extends BaseClass {
}