package Stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("hello world of given");
		
	}

	@When("user enters the test1 and test3")
	public void user_enters_the_test1_and_test3() {
	    // Write code here that turns the phrase above into concrete actions
	       System.out.println("hi is this");
	}

	@And("Click on Login button")
	public void click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("user in and method");

	}

	@Then("user is navigated to Homepage.")
	public void user_is_navigated_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is missed in tournament");
	}

}
