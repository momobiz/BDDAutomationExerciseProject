package BDDAutomationExerciseProjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductCardLocators {
	
	@CacheLookup
	@FindBy(xpath="//a[@href='/product_details/1']")
	public WebElement viewProductButton;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='features_items']/div[@class='col-sm-4']/div/div/div[2]/div/a")
	public WebElement addToCartButton;
	
	

}
