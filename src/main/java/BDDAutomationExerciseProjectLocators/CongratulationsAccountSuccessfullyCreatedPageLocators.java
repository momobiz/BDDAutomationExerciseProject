package BDDAutomationExerciseProjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CongratulationsAccountSuccessfullyCreatedPageLocators {
	
	@CacheLookup
	@FindBy(xpath="//b[contains(text(),'Account Created!')]")
	public WebElement accountCreatedMessage;
	
	@CacheLookup
	@FindBy(xpath="//a[@class='btn btn-primary']")
	public WebElement continueButton;

}
