package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\campaign.feature"},
		glue = {"steps","hooks"},
		plugin = {"pretty"},
		tags = "@campaign"
		
		
		)

public class CampaignRunner extends AbstractTestNGCucumberTests{
	
	
	
	

}
