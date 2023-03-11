package BDDAutomationExerciseProjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FooterLocators {
	
	
	@CacheLookup
	@FindBy(xpath="//h2[contains(text(),'Subscription')]")
	public WebElement subscriptionMessage;
	
	@CacheLookup
	@FindBy(xpath="//input[@id='susbscribe_email']")
	public WebElement subscriptionInput;
	
	@CacheLookup
	@FindBy(id="subscribe")
	public WebElement subscriptionButton;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='alert-success alert']")
	public WebElement alertSuccessMessage;
	

}
