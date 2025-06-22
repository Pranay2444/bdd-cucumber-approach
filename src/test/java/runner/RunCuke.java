package runner;
import io.cucumber.testng.CucumberOptions; // ✅ Use TestNG version
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = "src/test/resources/Features/facebookLogin.feature",
    glue = {"StepsDefinition"},
    plugin = {"html:target/cucumber-reports/cucumber-html-report.html" 
    	//	,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    }
)
public class RunCuke extends AbstractTestNGCucumberTests {

}


//glue --> Combines feature file with step definitions
// plugin --> for generating cucumber reports