package BDDAutomationExercisePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.SearchedProductsPageLocators;

public class SearchedProductsPage extends BasePage {

	Header header;
	SearchedProductsPageLocators searchedProductsPageLocators;
	List<ProductCard> listOfSearchedProducts = null;

	public SearchedProductsPage() {
		header = new Header();
		searchedProductsPageLocators = new SearchedProductsPageLocators();
		PageFactory.initElements(driver, searchedProductsPageLocators);

		setListOfSearchedProducts();
	}

	private void setListOfSearchedProducts() {
		listOfSearchedProducts = new ArrayList<ProductCard>();
		ProductCard product;
		for (WebElement locator : searchedProductsPageLocators.listOfSearchedProducts) {
			product = new ProductCard(locator);
			listOfSearchedProducts.add(product);

		}
	}

	public String getSearchedProductMessage() {
	
		return  searchedProductsPageLocators.searchedProductsMessage.getText();
	
	}
	
	public boolean areProductsSeachedEqualToProductDisplayed(String searchedProductName) {

		int numberOfProductDisplayed = listOfSearchedProducts.size();
		int counter = 0;
		

		for (ProductCard product : listOfSearchedProducts) {
			if (product.getProductName().toLowerCase()
					.contains(searchedProductName.toLowerCase())) {
				counter++;
			}
		}
		return counter == numberOfProductDisplayed;
	}

}
