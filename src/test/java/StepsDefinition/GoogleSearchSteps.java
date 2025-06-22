package StepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("Starting the broswer-OPEN");
		
		System.setProperty("Webdriver.chrome.driver", " ");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Given("user is on the google search page")
	public void user_is_on_the_google_search_page() {
	
	}

	@When("user enters a text in google searchbox")
	public void user_enters_a_text_in_google_searchbox() {
	
	}
	@When("hits enter button")
	public void hits_enter_button() {
	     
	}

	@Then("user is navigated to the Search Results page")
	public void user_is_navigated_to_the_search_results_page() {
	
	}


}
