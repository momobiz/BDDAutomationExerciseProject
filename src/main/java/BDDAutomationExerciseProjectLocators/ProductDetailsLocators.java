package BDDAutomationExerciseProjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsLocators {
	
	@CacheLookup
	@FindBy(xpath="//div[@class='product-information']/h2")
	public WebElement productName;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='product-information']/p")
	public WebElement productCategory;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='product-information']/span/span[1]")
	public WebElement productPrice;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='product-information']/p[2]")
	public WebElement productAvailability;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='product-information']/p[3]")
	public WebElement productCondition;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='product-information']/p[4]")
	public WebElement productBrand;
	
	

}
