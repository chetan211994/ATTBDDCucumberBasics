package uiappfeature;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import drivermanager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.PropReader;

public class AppHooks {

	PropReader prop;
	WebDriver driver;
	
	
	@Before
	public void launchBrowser() throws IOException
	{
		DriverFactory df = new DriverFactory();
		
		prop =new PropReader();
		String browserName = prop.readPropData("browser");//this is a browser name coming from config.property file.
		
		String cmdBrowsername = System.getProperty("cliBrowser");
		System.out.println("Browsername from command prompt received: "+cmdBrowsername);
		if(cmdBrowsername != null)
		{
			browserName=cmdBrowsername;
		}
		
		
		
	driver =df.initBrowser(browserName);
	
	driver.manage().window().maximize();
		
	}
	
	@After(order=2)
	public void  tearDown(Scenario scenario)
	{
		boolean scenarioStaus =scenario.isFailed();
		if(scenarioStaus)
		{
			String nameOfScenario=scenario.getName();
			String modifiedScenarioName=nameOfScenario.replace(" ", "_");
			
			TakesScreenshot ts= (TakesScreenshot)driver; //will capture the screenshot
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(source, "image/png", modifiedScenarioName);
		}
		
	}
	
	@After(order=1)
	public void shutDown()
	{
		driver.quit();
	}
	
	
	
}
