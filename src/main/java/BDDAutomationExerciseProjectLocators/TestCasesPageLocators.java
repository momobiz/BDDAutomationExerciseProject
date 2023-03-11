package BDDAutomationExerciseProjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TestCasesPageLocators {
	
	@CacheLookup
	@FindBy(xpath="//b[contains(text(),'Test Cases')]")
	public WebElement testCaseMessage;
	

}
