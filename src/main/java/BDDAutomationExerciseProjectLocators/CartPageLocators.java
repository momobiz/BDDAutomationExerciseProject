package BDDAutomationExerciseProjectLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CartPageLocators {
	
	@CacheLookup
	@FindBy(xpath="//tr[contains(@id,'product-')]")
	public List<WebElement> listOfItems; 

}
