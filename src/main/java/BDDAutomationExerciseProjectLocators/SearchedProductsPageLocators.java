package BDDAutomationExerciseProjectLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.google.common.cache.Cache;

public class SearchedProductsPageLocators {
	
	@CacheLookup
	@FindBy(xpath = "//div[@class='features_items']/div[@class='col-sm-4']")
	public List<WebElement> listOfSearchedProducts;
	
	@CacheLookup
	@FindBy(xpath="//h2[@class='title text-center']")
	public WebElement searchedProductsMessage;

}
