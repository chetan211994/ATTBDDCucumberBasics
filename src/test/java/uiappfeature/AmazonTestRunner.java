package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		//features = {"src\\test\\resources\\uiappfeature"},
	    features = {"src\\test\\resources\\parallel"},
		glue = {"uiappfeature"},
		plugin = {
				"pretty",
				"html:target/amazontestreport/reports.html",
				//"rerun:target/failedrun.txt"
		         },
		publish =true,
	    tags = "@sanity"
		
				
		)

public class AmazonTestRunner extends AbstractTestNGCucumberTests{
	
	

}
