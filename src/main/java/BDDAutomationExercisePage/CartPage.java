package BDDAutomationExercisePage;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BDDAutomationExerciseProjectLocators.CartPageLocators;

public class CartPage extends BasePage{
	
	public Header header;
	public Footer footer;
	public CartPageLocators cartPageLocators;
	public List<ItemInCartPage> listItemInCartPage;
    public CartAddressDetailsPage cartAddressDetails=null;
    
    String deletedProduct=null;
  
	 
	
	
	
	public CartPage() {
		header=new Header();
		footer=new Footer();
		cartPageLocators=new CartPageLocators();
		PageFactory.initElements(driver, cartPageLocators);
		
		setListOfItemInCart();
	}
	
	public CartPage(String userConnected) {
		header=new Header("userConnected");
		footer=new Footer();
		cartPageLocators=new CartPageLocators();
		PageFactory.initElements(driver, cartPageLocators);
		setListOfItemInCart();
		
		cartAddressDetails=new CartAddressDetailsPage();
	}
	/******************************************************/
	
	public void scrollDownToFooter() {
		scrollToWebElement(footer.footerLocators.alertSuccessMessage);
	}
	
	private void setListOfItemInCart(){
		ItemInCartPage item;
		listItemInCartPage=new ArrayList<ItemInCartPage>();
		for(WebElement locator:cartPageLocators.listOfItemLocators) {
			item=new ItemInCartPage(locator);
            listItemInCartPage.add(item);
			
		}
		
		
	}
	
	public boolean isProductInCart(String productName) {
		boolean state=false;
		for(ItemInCartPage item:listItemInCartPage) {
				if(item.getNameOfItem().contains(productName.toLowerCase())) {
				state=true;
				break;
			}
			
		}
		return state;
		
		
	}
	private int indexOfProductInCart(String productName) {
		int index=0;
		if(isProductInCart(productName)) {
			for(ItemInCartPage item:listItemInCartPage) {
				if(item.getNameOfItem().contains(productName.toLowerCase())) {
				index++;
				break;
			}
			
		}
			
		}
		return index;
	}
	public String getProductPrice(String productName) {
		int index=indexOfProductInCart(productName);
		return listItemInCartPage.get(index-1).getItemPrice();	
	}
	public String getProductQuantity(String productName) {
		int index=indexOfProductInCart(productName);
		return listItemInCartPage.get(index-1).getItemQuanty();	
		
	}
	public String getTotalPrice(String productName) {
		int index=indexOfProductInCart(productName);
		return listItemInCartPage.get(index-1).getItemTotalPrice();
		
	}
	
	public boolean proceedToCheckoutIsDisplayed() {
		boolean state=false;
		try {
			
			state=isDisplayed(cartPageLocators.proceedToCheckoutButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return state;
		
	}
	
	
	
	public SignupLoginPage clickOnProceedCheckoutButton() {
//		clickOn(cartPageLocators.proceedToCheckoutButton);
		clickOnProceedToCheckOut();
		CheckoutAlertCard checkoutAlertCard=new CheckoutAlertCard();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return checkoutAlertCard.clickOnRegisterLoginButton();
	}
	/********      *******/
	public void clickOnProceedToCheckOut() {
		clickOn(cartPageLocators.proceedToCheckoutButton);
	}
	

	public CartPage whenconnectedclickOnProceedCheckoutButton() {
		  clickOnProceedToCheckOut();
		  return new CartPage("userConnected");
	}
	
	public void addDescription(String description) {
		scrollToWebElement(cartPageLocators.descriptionTextArea);
		moveToWebElement(cartPageLocators.descriptionTextArea);
		
		fillIn(cartPageLocators.descriptionTextArea, description);
	}
	public PaymentDetailsPage clickOnplaceOrderButton() {
		scrollToWebElement(cartPageLocators.placeOrderButton);
		moveToWebElement(cartPageLocators.placeOrderButton);
		clickOn(cartPageLocators.placeOrderButton);
		return new PaymentDetailsPage();
	}
	/*************************/

	private void setListOfItemInCartAfterDelete(){
		ItemInCartPage item;
		listItemInCartPage=new ArrayList<ItemInCartPage>();
		List<WebElement> itemLocators=driver.findElements(By.xpath("//tr[contains(@id,'product-')]"));
		for(WebElement locator:itemLocators) {
			item=new ItemInCartPage(locator);
            listItemInCartPage.add(item);
			
		}
		
		
	}
	
	public void removeItemFromCart(String numberOfItemInCart) {
		ItemInCartPage itemToDelete=listItemInCartPage.get(Integer.valueOf(numberOfItemInCart)-1);
		deletedProduct=itemToDelete.getNameOfItem();
		itemToDelete.clickOnXButton();
		wait.until(ExpectedConditions.invisibilityOf(itemToDelete.itemWebElement));
		setListOfItemInCartAfterDelete();
	}
	public boolean isDeletedProductInCart() {
		return isProductInCart(deletedProduct);
	}
	
	
	
	
	
	
	
	
	

}
