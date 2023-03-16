package BDDAutomationExerciseProjectLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CartPageLocators {
	
	@CacheLookup
	@FindBy(xpath="//tr[contains(@id,'product-')]")
	public List<WebElement> listOfItemLocators; 
	
	@CacheLookup
	@FindBy(xpath="//a[@class='btn btn-default check_out']")
	public WebElement proceedToCheckoutButton;
	
	@CacheLookup
	@FindBy(xpath="//textarea[@class='form-control']")
	public WebElement descriptionTextArea;
	
	@CacheLookup
	@FindBy(xpath="//a[@class='btn btn-default check_out']")
	public WebElement placeOrderButton;
	

}
