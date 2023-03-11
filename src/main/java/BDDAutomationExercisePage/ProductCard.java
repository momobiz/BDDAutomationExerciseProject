package BDDAutomationExercisePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.ProductCardLocators;

public class ProductCard extends BasePage{
	
	ProductCardLocators productCardLocators;
	public WebElement productCardWebElement;
	

	
	public ProductCard(WebElement locator) {
		productCardLocators=new ProductCardLocators();
		PageFactory.initElements(driver, productCardLocators);
		productCardWebElement=locator;
	}
	
	public AlertCard clickOnAddProductToCart() {		
		WebElement addButton=productCardWebElement.findElement(By.xpath("./div/div/div[2]/div/a"));
		
			
			if(isDisplayed(addButton)) {
				addButton.click();	
		}
		return new AlertCard();	
	}
	public String getProductName() {
		return productCardWebElement.findElement(By.xpath("./div/div/div[2]/div/p")).getAttribute("innerHTML");
		
	}
	
}
