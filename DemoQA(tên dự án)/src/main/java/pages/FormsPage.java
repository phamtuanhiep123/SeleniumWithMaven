package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class FormsPage extends Page {

	public FormsPage(WebDriver dr) {
		super(dr);
	}	
	
	public AutomationPracticeForm clickonPracticeFrom () {
		driver.findElement(By.xpath("//*[@class='btn btn-light active']")).click();
		return new AutomationPracticeForm (driver);
	}
	
	
}
