package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.*;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Assignment/Features/AcceptanceCriteria6.feature",
		glue= {"pageObject6"}
		
		)

public class rClass6 {

}
