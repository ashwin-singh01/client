package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.*;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Assignment/src/test/java/pageObject2",
		glue= {"pageObject2"}
		
		)

public class rClass2 {

}
