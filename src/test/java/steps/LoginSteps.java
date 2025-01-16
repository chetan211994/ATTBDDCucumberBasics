package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("I am at the login page")
	public void preRequisite()
	{
		System.out.println("Given Statement");
	}
	
	@When("I enter the credentials")
	public void enterCredentials()
	{
		System.out.println("Enetring Credentials");
	}
	
	@When("I click on login button")
	public void clickOnLogin()
	{
		System.out.println("Click on Login Button");
	}
	
	@Then("I should be able to login")
	public void validateLogin()
	{
		System.out.println("Login Validated");
	}
	

	@Then("I should see page title")
	public void validateLoginTitle()
	{
		System.out.println("Title validated ");
	}
}
