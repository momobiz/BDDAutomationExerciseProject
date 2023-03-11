package BDDAutomationExerciseProjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HeaderLocators2 {
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Signup / Login')]")
	public WebElement signupLoginLink;

}
