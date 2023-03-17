package BDDAutomationExercisePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.ItemInCartPageLocators;

public class ItemInCartPage extends BasePage{
	
	ItemInCartPageLocators itemInCartPageLocators;
	WebElement itemWebElement;
	
	public ItemInCartPage(WebElement locator) {
		itemInCartPageLocators=new ItemInCartPageLocators();
		PageFactory.initElements(driver, itemInCartPageLocators);
		itemWebElement=locator;
		
	}
	public String getNameOfItem() {
		return itemWebElement.findElement(By.xpath("./td[2]/h4/a")).getText().toLowerCase();
	}
	
	public String getItemPrice() {
		return itemWebElement.findElement(By.xpath("./td[3]/p")).getText();
		
	}
	public String getItemQuanty() {
		return itemWebElement.findElement(By.xpath("./td[4]/button")).getText();
	}
	public String getItemTotalPrice() {
		return itemWebElement.findElement(By.xpath("./td[5]/p")).getText();
		
	}
	public void clickOnXButton() {
		clickOn(itemWebElement.findElement(By.xpath("./td[6]/a")));
	}
	

}
