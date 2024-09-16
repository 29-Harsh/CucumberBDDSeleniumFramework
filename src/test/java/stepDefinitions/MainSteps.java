package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("Admin is on login page")
	public void admin_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Admin is on login page"); 
	    //throw new io.cucumber.java.PendingException();
	}
	
	
	//@When("^Admin enters credentials username (.+) and password (.+) $")
	// This is for regex to accept any type of data from feature file "ANYTHING" - IMPORTANT
	
	
	@When("Admin enters credentials username {string} and password {string}")
	public void admin_enters_credentials_username_and_password(String a, String b) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(a+ "- admin_enters_credentials_username_and_password -" + b); 
	    //throw new io.cucumber.java.PendingException();
	}
	
	
	/*  This is use when you have list of data for e.g filling form
	 * @When("User enters credentials")
	public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    throw new io.cucumber.java.PendingException();
}*/
	
	@Then("Display Home page")
	public void display_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("display_home_page"); 
	    //throw new io.cucumber.java.PendingException();
	}
	
}
