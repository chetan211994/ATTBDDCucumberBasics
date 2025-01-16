package parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\parallel\\Homepage.feature"},
		glue = {"parallel"},
		plugin = {
				"pretty",
				"html:target/amazontestreport/reports.html",
				"rerun:target/failedrun.txt"
		         },
		publish =true
		//tags ="@functional"
		
				
		)



public class ParallelRun extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel =true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
	
}
