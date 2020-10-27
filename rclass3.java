package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.*;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Assignment/Features/AcceptanceCriteria3.feature",
		glue= {"pageObject3"}
		
		)


public class rclass3 {

}
