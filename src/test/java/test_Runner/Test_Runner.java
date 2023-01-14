package test_Runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	
		tags= "@Smoke",
		features = {"Feature"},
		glue = "step_definition"
		//dryRun = true
		
		
		)

public class Test_Runner {

	
	
}
