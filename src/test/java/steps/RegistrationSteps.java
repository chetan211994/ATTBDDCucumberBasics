package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {
	@Given("user is at account page")
	public void user_is_at_account_page() {
		  System.out.println("Given statement");
	}

	@When("user enters following data")
	public void user_enters_following_data(DataTable dataTable) {
	    List<List<String>> data = dataTable.asLists();
	    List<String> firstList = data.get(1);
	    System.out.println(firstList);
	    String emailAddress=firstList.get(2);
	    System.out.println("Email address from 1st index position is "+emailAddress);

		String lastname = data.get(0).get(1);
		
		System.out.println(lastname);
		
		System.out.println("*********************************************");
		//Iterating the list
        
		List<String> firstIndexList = data.get(1);
		
//		for(String value: firstIndexList)
//		{
//			System.out.println(value);
//		}
		for(int i = 0; i<firstIndexList.size(); i++)
		{
			String value = firstIndexList.get(i);
			System.out.println(value);
		}


		
		System.out.println("*********************************************");
		
		List<Map<String, String>> mapData = dataTable.asMaps();
		Map<String, String> zerothList = mapData.get(0); 
		//here in Map<String, String> First String is Key values means Column name and second String means column value
		String phoneNumber = zerothList.get("phone");

		System.out.println(phoneNumber);

	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		System.out.println("Clicked on submit button");
	}

	@Then("user should gets confirmation")
	public void user_should_gets_confirmation() {
		  System.out.println("User created!");  
	}

}
