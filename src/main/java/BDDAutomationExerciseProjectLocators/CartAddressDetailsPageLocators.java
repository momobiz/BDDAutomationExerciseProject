package BDDAutomationExerciseProjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CartAddressDetailsPageLocators {
	
	@CacheLookup
	@FindBy(xpath="//h2[contains(text(),'Address Details')]")
	public WebElement addressDetails;

}
