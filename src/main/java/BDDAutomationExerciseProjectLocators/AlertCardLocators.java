package BDDAutomationExerciseProjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AlertCardLocators {
	
	@CacheLookup
	@FindBy(xpath="//div[@class='modal-content']/div[2]/p[2]/a")
	public WebElement viewCartLink;
	
	@CacheLookup
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']")
	public WebElement continueShoppingButton;
	

}
