package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\MyWorkspaces\\Assignment\\Features\\AcceptanceCriteria2.feature",
		glue= {"pageObject2"}
		
		)

public class rClass2 {

}
