package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//Features",	
		glue = {"stepDef"},
		monochrome=true,
		tags = "@RegressionTest and @PhaseTwo or @PhaseOne and @SmokeTest",
		plugin = {"pretty",
				"html:target/reports/HtmlReport.html"}
				//"rerun:target/failed_scenario.txt"}
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class TestNGRunner extends AbstractTestNGCucumberTests{


}
