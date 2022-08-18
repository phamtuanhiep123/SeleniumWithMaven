package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class HomePage extends Page {
	
	 public HomePage(WebDriver dr) {
			super(dr);
			
		}
	public ElementsPage clickonElements () {
			driver.findElement(By.xpath("//h5[text()='Elements']/..")).click();
		 return new ElementsPage(driver);
	 }
	 public void scroll () {
		 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 }
	 
	 public FormsPage clickonFroms () {
			driver.findElement(By.xpath("//*[@class='category-cards']/div[2]")).click();

			return new FormsPage (driver);
	}
}
