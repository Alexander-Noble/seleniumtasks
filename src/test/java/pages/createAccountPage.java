package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createAccountPage {
	
	private WebDriver webDriver;
	
	@FindBy(id="email-create")
	private WebElement emailCreateField;
	
	@FindBy(id="SubmitCreate")
	private WebElement createAccountButton;
	
	public createAccountPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		
		webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		if(!webDriver.getTitle().equals("Login - My Store")) {
			throw new IllegalStateException("Page not loaded");
		}
	}
	
	public creationPage login(String email) {
		emailCreateField.sendKeys(email);
		createAccountButton.submit();
		
		return PageFactory.initElements(webDriver, creationPage.class);
	}

}
