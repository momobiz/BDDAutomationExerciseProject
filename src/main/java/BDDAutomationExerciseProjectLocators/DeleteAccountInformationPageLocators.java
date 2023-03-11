package BDDAutomationExerciseProjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DeleteAccountInformationPageLocators {
	
	@CacheLookup
	@FindBy(xpath="//b[contains(text(),'Account Deleted!')]")
	public WebElement accountDeletedMessage;
	
	@CacheLookup
	@FindBy(xpath="//a[@class='btn btn-primary']")
	public WebElement continueButton;
	

}
