package parallel;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivermanager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {
	
	HomePage homepage= new HomePage(DriverFactory.getDriver());
	@Given("I am at the landing page")
	public void i_am_at_the_landing_page(){
		
	    WebDriver driver = DriverFactory.getDriver();
		
	    driver.get("https://www.amazon.in/");
		
	}
	
	@Then("Page title should contains {string}")
	public void page_title_should_contains(String string) {
	  
	  String actualTitle = homepage.fetchTitle();
	 boolean isPresent = actualTitle.contains(string);
	 Assert.assertEquals(isPresent, true);
		
	}

	
	@Then("cart icon should get display")
	public void cart_icn_should_get_display() {
	 boolean isDiplaying=homepage.verifyCartIcon();
	 Assert.assertEquals(isDiplaying, true);
		
	}

	@When("I click on sports section")
	public void i_click_on_sports_section() {
	    
		homepage.enteringSaleSection();
	}

	@Then("business tab should gets displayed")
	public void cricket_tab_should_gets_displayed() {
	  boolean isDispalying=homepage.identifyBusinessTab();
	  Assert.assertEquals(isDispalying, true);
	}

	
	
}
