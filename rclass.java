package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\MyWorkspaces\\Assignment\\Features\\AcceptanceCriteria1.feature",
		glue= "pageObject"
		
		)
public class rclass {
	
}
