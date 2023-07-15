package marsRover.marsRover.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import marsRover.marsRover.Rover;
import marsRover.marsRover.Pages.Page;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginSteps extends Steps{
	
	@Given("I have logged in using browser {string}")
	public void i_have_logged_in_using_browser(String browser) {
		getDriver(browser);
	}
	
	@Given("I login using {string} and {string}")
	public void i_have_logged_in_using_creds(String un, String pwd)
	{
		try {
			loginpage.login(un,pwd);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Given("I search for channel {string}")
	public void i_have_searched(String keyword)
	{
		try {
			loginpage.search(keyword);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then("I click video {string}")
	public void clickvideos(String keyword) throws InterruptedException
	{
		loginpage.clickvideo(keyword);
	}
	
	@Then("I close all browsers")
	public void closedrivers()
	{
		try {
			loginpage.closedrivers();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
