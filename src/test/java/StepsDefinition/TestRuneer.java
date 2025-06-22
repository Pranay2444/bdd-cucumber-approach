package StepsDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features",
		glue = {"StepDefinitions"},
				plugin = {"pretty", "html:target/cucumber-reports.html"}, // Report generation
		        monochrome = true ,// For readable console output
		        tags="@smoketest"
	
		
		)
 
public class TestRuneer {
	

}
