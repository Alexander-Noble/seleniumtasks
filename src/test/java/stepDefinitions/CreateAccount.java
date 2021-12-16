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
}
