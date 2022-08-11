package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckBoxPage extends Page {

	public CheckBoxPage(WebDriver dr) {
		super(dr);
	}

	public boolean verifyCheckbox() {
		boolean isSelected = driver.findElement(By.xpath(
				"//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]"))
				.isSelected();
		if (!isSelected) {
			System.out.println("TCs Pass");
		} else {
			System.out.println("TCs False");
		}
		return isSelected;

	}

	public boolean clickCheckbox() {
		boolean isSelected = driver.findElement(By.xpath(
				"//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]"))
				.isSelected();
		if (isSelected == false) {
			driver.findElement(By.xpath(
					"//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]"))
					.click();
		}
		return isSelected;
	}
	public void clickIcon () {
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]/svg[1]"))
				.click();
	}
   public boolean verifyMultiCheckbox () {
	   boolean deskTop = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/svg[1]/path[1]"))
				.isSelected();
		if (deskTop == true) {
			System.out.println( "DeskTop-TCs Pass");
	}

		boolean documents = driver.findElement(By.xpath(
				"//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]"))
				.isSelected();
		if (documents == true) {
			System.out.println( "Documents-TCs Pass");
	}

		boolean download = driver.findElement(By.xpath(
				"//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]"))
				.isSelected();
		if (download == true) {
			System.out.println( "Download-TCs Pass");
			
   } 
		
		if (deskTop && documents && download) {
			return true;
		}
		return false;

   }
   public void getText () {
		String css = driver.findElement(By.id("result")).getText();

   }
}
