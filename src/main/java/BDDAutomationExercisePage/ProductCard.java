package BDDAutomationExercisePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BDDAutomationExerciseProjectLocators.ProductCardLocators;

public class ProductCard extends BasePage{
	
	ProductCardLocators productCardLocators;
	public WebElement productCardWebElement=null;
	public WebElement addProductButton;
	public WebElement viewProductButton;
	
	//

	
	public ProductCard(WebElement locator) {
		productCardWebElement=locator;
		addProductButton=locator.findElement(By.xpath("./div/div/div[2]/div/a"));
		viewProductButton=locator.findElement(By.xpath("./div/div[2]/ul/li/a"));
		
		
	}
	
	public AlertCard clickOnAddProductToCart() {	
		AlertCard alertCard=null;
		try {
			Thread.sleep(1000);
			addProductButton.click();
			alertCard= new AlertCard();	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return alertCard;
	}
	
	
	public String getProductName() {
		return productCardWebElement.findElement(By.xpath("./div/div/div[2]/div/p")).getAttribute("innerHTML");
		
	}
	
	public ProductDetailsPage clickOnViewProductButton() {
		
		viewProductButton.click();
		return new ProductDetailsPage();
	}
	
	
}
