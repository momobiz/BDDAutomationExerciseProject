package BDDAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.ProductDetailsLocators;

public class ProductDetailsPage extends BasePage {
	Header header;
	ProductDetailsLocators productDetailsPageLocators;
	public AlertCard alertCard=null;

	public ProductDetailsPage() {
		header = new Header();
		productDetailsPageLocators = new ProductDetailsLocators();
		PageFactory.initElements(driver, productDetailsPageLocators);
	}
	
	public boolean productDetailsPageIsDeplayed() {
		return isDisplayed(productDetailsPageLocators.productDetailsFrame);
	}

	public boolean productNameIsDisplayed() {
		return isDisplayed(productDetailsPageLocators.productName);

	}

	public boolean productCategoryIsDisplayed() {
		return isDisplayed(productDetailsPageLocators.productCategory);

	}

	public boolean productPriceIsDisplayed() {
		return isDisplayed(productDetailsPageLocators.productPrice);
	}

	public boolean productAvailabilityIsDisplayed() {
		return isDisplayed(productDetailsPageLocators.productAvailability);
	}

	public boolean productConditionIsDisplayed() {
		return isDisplayed(productDetailsPageLocators.productCondition);
	}

	public boolean productBrandIsdisplayed() {
		return isDisplayed(productDetailsPageLocators.productBrand);
	}
	public void increaseQuantity(String quantity) {
		insertValueInDynamicDropdown(productDetailsPageLocators.quantityDynamicDropdown, quantity);
		
	}
	public void clickOnToAddToCartButton() {
		productDetailsPageLocators.addToCartButton.click();
		alertCard= new AlertCard();
	}
	public CartPage clickOnViewCartButton() {
		try {
			alertCard.clickOnViewCartLink();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new CartPage();
	}
	
	

}
