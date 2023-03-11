package BDDAutomationExercisePage;

import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.ProductCardLocators;
import BDDAutomationExerciseProjectLocators.ProductsPageLocators;

public class ProductsPage extends BasePage {

	ProductsPageLocators productsPageLocators;
	Header header;
	List<ProductCard> listOfProductCard;
	AlertCard alertCard = null;

	public ProductsPage() {
		header = new Header();
		productsPageLocators = new ProductsPageLocators();
		PageFactory.initElements(driver, productsPageLocators);

		listOfProductCard = setListOfProductCard();

	}

	public boolean allProductsMessageIsDisplayed() {
		return isDisplayed(productsPageLocators.allProductsMessage);
	}

	public boolean productsListIsDisplayed() {
		scrollDown(200);
		return listOfProductCard.size() > 1;
	}



	public ProductCard getProduct(String productNumber) {

		return listOfProductCard.get(Integer.valueOf(productNumber));

	}

	public ProductDetailsPage getProductDetails(String productNumber) {

		ProductCard product = getProduct(productNumber);
		scrollToWebElement(product.productCardWebElement);
		product.productCardLocators.viewProductButton.click();
		return new ProductDetailsPage();

	}

	public SearchedProductsPage searchProduct(String productName) {
		fillIn(productsPageLocators.searchInput, productName);
		productsPageLocators.submitSearchButton.click();
		return new SearchedProductsPage();

	}
	

	public void hoverOnProductAndClickAddToCart(String numberOfProduct) {
		ProductCard productCard = listOfProductCard.get(Integer.valueOf(numberOfProduct) - 1);
		scrollToWebElement(productCard.productCardWebElement);
		moveToWebElement(productCard.productCardWebElement);
		alertCard = productCard.clickOnAddProductToCart();

	}

	public void clickOnAlertCardContinueshoppingButton() {
		if (alertCard != null) {
			alertCard.clickOnContinueShoopingButton();
		}

	}

	public CartPage clickOnAlertCardViewCart() {
		if (alertCard != null) {
			alertCard.clickOnViewCartLink();
		}
		return new CartPage();
	}

	private List<ProductCard> setListOfProductCard() {
		List<ProductCard> listOfProductCard = new ArrayList<ProductCard>();

		for (WebElement locator : productsPageLocators.listOfAllProducts) {
			listOfProductCard.add(new ProductCard(locator));

		}
		return listOfProductCard;

	}

}
