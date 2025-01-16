package drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
	static WebDriver driver;
	
	//To launch the browser and return its object
	public WebDriver initBrowser(String browsername)
	{

		if(browsername.equalsIgnoreCase("Chrome"))
		{
//			ChromeOptions options =new ChromeOptions();
//			options.addArguments("--disable-popup-blocking");
//			DesiredCapabilities capabilities = new DesiredCapabilities();
//			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		 driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			
			driver = new FirefoxDriver();
		}
		
		return driver;
	}
	
	public  static WebDriver getDriver()
	{
		return driver;
	}
	
	

}
