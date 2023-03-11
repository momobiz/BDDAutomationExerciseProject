package BDDAutomationExerciseProjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AlertCardLocators {
	
	@CacheLookup
	@FindBy(xpath="//u[contains(text(),'View Cart')]")
	public WebElement viewCartLink;
	
	@CacheLookup
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']")
	public WebElement continueShoppingButton;
	

}
