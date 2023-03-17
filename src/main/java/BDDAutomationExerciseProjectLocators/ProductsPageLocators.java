package BDDAutomationExerciseProjectLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import BDDAutomationExercisePage.ProductCard;

public class ProductsPageLocators {

	@CacheLookup
	@FindBy(xpath = "//h2[@class='title text-center']")
	public WebElement allProductsMessage;

	@CacheLookup
	@FindBy(xpath = "//div[@class='features_items']/div[@class='col-sm-4']")
	public List<WebElement> listOfAllProducts;
	
	@CacheLookup
	@FindBy(id="search_product")
	public WebElement searchInput;
	
	@CacheLookup
	@FindBy(id="submit_search")
	public WebElement submitSearchButton;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='features_items']/h2")
	public WebElement productsPageTitle;
	
	
	
	
	


}
