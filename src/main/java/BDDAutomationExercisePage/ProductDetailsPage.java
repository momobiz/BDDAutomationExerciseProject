package BDDAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.ProductDetailsLocators;

public class ProductDetailsPage extends BasePage {
	Header header;
	ProductDetailsLocators productDetailsPageLocators;

	public ProductDetailsPage() {
		header = new Header();
		productDetailsPageLocators = new ProductDetailsLocators();
		PageFactory.initElements(driver, productDetailsPageLocators);
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

}
