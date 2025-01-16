package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\Registration.feature"},
		glue = {"steps"},
		plugin ={"pretty"}
		
		)



public class RegistrationRunner extends AbstractTestNGCucumberTests{

}
