package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TextBoxPage extends Page {
	
	public TextBoxPage(WebDriver dr) {
		super(dr);
	}


	public By lbNameElement = By.id("name");
	public By lbEmailElement = By.id("email");
	public By lbCurrentAddressElement = By.id("currentAddress");
	public By lbPermanentAddressElement = By.id("permanentAddress");

	public void inputData(String name,String email, String currentAddress, String permanentAddress   ) {
		driver.findElement(By.id("userName")).sendKeys(name);
		driver.findElement(By.id("userEmail")).sendKeys(email);
		driver.findElement(By.id("currentAddress")).sendKeys(currentAddress);
		driver.findElement(By.id("permanentAddress")).sendKeys(permanentAddress);

		
	}

	public void clickSubmits() {
		driver.findElement(By.id("submit")).click();

	}
	
	public boolean verifyData (By locator, String expectedData) {
		boolean result = false;
		String actualData =driver.findElement(locator).getText();
		if (actualData.equals(expectedData)) {
			result =true;
		}
		return result;
	}
	
	
	public boolean verifyRedBorder (By locator ) {
		boolean result = false;
		String css = driver.findElement(locator).getCssValue(".field-error");
		if (css != "") {
			result = true;
		}
		return result;
		
	}
}
