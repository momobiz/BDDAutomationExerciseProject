package BDDAutomationExercisePage;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger = Logger.getLogger(BasePage.class.getName());
	public static WebDriverWait wait;
	public static JavascriptExecutor js;
	public static Select select;
	public static Actions actions;
	
	

	public static void lauchBrowser(String browserName) {

		prop = ReadConfigFile.generateProp();

		driver = Browser.getInstance().getDriver(browserName);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void openUrl(String url) {
		driver.get(url);

	}

	public boolean isDisplayed(WebElement element) {
		wait = new WebDriverWait(driver, 10);

		try {
			wait.until(ExpectedConditions.visibilityOf(element));

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;

		}
		return true;

	}
	
	public void clickOn(WebElement element) {
		element.click();
	}
	
	public void fillIn(WebElement element, String str) {
		element.clear();
		element.sendKeys(str);
	}
	
	public void selectRadioButton(List<WebElement> radios, String gender) {
		try {
			for(WebElement radio:radios) {
				if(radio.getAttribute("value").contentEquals(gender)) radio.click();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	public String toCamelCase(String str) {
		String str1=str.toLowerCase();
		return Character.toUpperCase(str.charAt(0))+str1.substring(1);
		
	}
	
	public void scrollDown(int pixelNumber) {
		js=(JavascriptExecutor) driver;
		js.executeScript("scroll(0,"+pixelNumber+")");
		
	}
	public void selectOption(WebElement dropDown, String option) {
		select=new Select(dropDown);
		select.selectByValue(option);
	}
	public void selectCheckbox(WebElement checkbox) {
		if(!checkbox.isSelected()) checkbox.click();
	}
	public void deSelectCheckbox(WebElement checkbox) {
		if(checkbox.isSelected()) checkbox.click();
	}
	public void moveToWebElement(WebElement element) {
		actions=new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	public void moveToWebElementAndClick(WebElement element) {
		actions=new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}
	public void scrollToWebElement(WebElement webElement) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", webElement);
	}
	
	public static byte[] takeScreenshot() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
	
	public static void uploadFile(WebElement element, String filePath) {
		element.sendKeys(filePath);
	}
	
	
	public static void quitDriver() {
		driver.quit();
	}
	public static void clickOnOkAlertButton() {
		driver.switchTo().alert().accept();
	}
	
	public void insertValueInDynamicDropdown(WebElement dynamicDropdown, String value) {
		dynamicDropdown.clear();
		dynamicDropdown.sendKeys(value);
	}

}
