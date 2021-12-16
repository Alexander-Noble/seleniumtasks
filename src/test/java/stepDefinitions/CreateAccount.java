package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import utils.WebDriverHooks;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount {
	
	private WebDriver webDriver;
	
	public CreateAccount(WebDriverHooks hooks) {
		this.webDriver = hooks.getWebDriver();
	}
	
	@When("the user enters an email address and clicks create account")
	public void theUserCreates(String email) {
		webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	
	@Then("the user will have an account created")
	public void theUserAccountIsCreated() {
		assertEquals();
	}
}
