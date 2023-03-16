package BDDAutomationExerciseProjectLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@CacheLookup
	@FindBy(xpath="//a/button[contains(text(),'Test Cases')]")
	public List<WebElement> testCasesButtons;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='features_items']/child::div[@class='col-sm-4']")
	public List<WebElement> listOfProductCardLocator;

}
