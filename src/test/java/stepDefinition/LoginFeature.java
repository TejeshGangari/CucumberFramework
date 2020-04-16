package stepDefinition;

import Utilities.WebFactory;
import base.ReusableLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFeature extends ReusableLibrary{

	@Given("^Open the application$")
	public void open_the_application(){
	    driver = WebFactory.getDriver("CHROME");
	    driver.get(prop.getProperty("URL"));
	}

	@When("^user enters userName and password$")
	public void user_enters_userName_and_password(){
	    
	}

	@Then("^user should be logged in$")
	public void user_should_be_logged_in(){
	    
	}

	@Then("^Homepage should be displayed$")
	public void homepage_should_be_displayed(){
	    
	}
}
