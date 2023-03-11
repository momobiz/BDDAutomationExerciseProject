package BDDAutomationExercisePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BDDAutomationExerciseProjectLocators.CartPageLocators;

public class CartPage extends BasePage{
	
	public Header header;
	public Footer footer;
	public CartPageLocators cartPageLocators;
	 List<ItemInCartPage> listItemInCartPage;
	
	
	public CartPage() {
		header=new Header();
		footer=new Footer();
		cartPageLocators=new CartPageLocators();
		PageFactory.initElements(driver, cartPageLocators);
		listItemInCartPage=new ArrayList<ItemInCartPage>();
	}
	
	public void scrollDownToFooter() {
		scrollToWebElement(footer.footerLocators.alertSuccessMessage);
	}
	
	private void setListOfItemInCart(){
		ItemInCartPage item;
		for(WebElement locator:cartPageLocators.listOfItems) {
			item=new ItemInCartPage(locator);
            listItemInCartPage.add(item);
			
		}
		
		
	}
	
	public boolean isProductInCart(String productName) {
		setListOfItemInCart();
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
		int index=-1;
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
		return listItemInCartPage.get(index).getItemPrice();	
	}
	public String getProductQuantity(String productName) {
		int index=indexOfProductInCart(productName);
		return listItemInCartPage.get(index).getItemQuanty();	
		
	}
	public String getTotalPrice(String productName) {
		int index=indexOfProductInCart(productName);
		return listItemInCartPage.get(index).getItemTotalPrice();
		
	}
	
	
	
	
	
	
	

}
