package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
    System.out.println("User navigated to login page");	     
   // throw new io.cucumber.java.PendingException();
	 
}
	

	@When("user enters username and passwords")
	public void user_enters_username_and_passwords() {
 System.out.println("Inside step - user enters username & password");
// throw new io.cucumber.java.PendingException();
 	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		 System.out.println("Inside step - user clicks o login button");
	//	 throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    
		 System.out.println("Inside step - user is on homepage");
		// throw new io.cucumber.java.PendingException();
	}




}
