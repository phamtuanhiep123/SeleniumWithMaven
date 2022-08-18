package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticeForm extends Page{
	public AutomationPracticeForm(WebDriver dr) {
		super(dr);
	}
	public By lbFirstNameElement = By.id("firstName");
	public By lbLastNameElement = By.id("lastName");
	public By lbEmailElement = By.id("userEmail");
	public By lbMobileNumber = By.id("userNumber");
	public By lbSubjects = By.id("subjects");
	public By lbcurrentAddress = By.id("currentAddress");
	 public void inputData (String firstName,String lastName,String userEmail,String userNumber, String subjects, String currentAddress ) {
		 driver.findElement(By.id("firstName"));
		 driver.findElement(By.id("lastName"));
		 driver.findElement(By.id("userEmail"));
		 driver.findElement(By.xpath("//*[@for='gender-radio-1']")).click();
		 driver.findElement(By.id("userNumber"));
		 driver.findElement(By.xpath("//*[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
		 driver.findElement(By.xpath("//*[@for='hobbies-checkbox-1']")).click();
		 driver.findElement(By.id("uploadPicture")).sendKeys("D:\\AutomationTest\\03Practices\\05Git\\02SeleniumWithMaven\\SeleniumWithMaven\\DemoQA(tên dự án)\\src\\main\\resources\\aaa.jpg");
		 
		 driver.findElement(By.id("currentAddress"));
	 }
	public void clickSubmits() {
		driver.findElement(By.id("submit"));
	}
/**
 * 	
 * @param date: dd MMMM yyyy (01 August 1990)
 */
   public void inputDate (String date) {
	   String [] splittedDate = date.split(" ");
	   driver.findElement(By.id("dateOfBirthInput")).click();
	   WebElement monthElement = driver.findElement(By.xpath("//div/div[1]/select"));
	   Select month = new Select(monthElement);
	   month.selectByVisibleText(splittedDate[1]);
	   WebElement yearElement = driver.findElement(By.xpath("//div/div[2]/select"));
	   Select year = new Select(yearElement);
	   year.selectByVisibleText(splittedDate[2]);
	   String day = splittedDate[0];
	   String newday = " ";
	   if (day.charAt(0)==0) {
		   newday = day.replace("0", " ");
	   }
	   else {
		   newday =day;
	   }
	   int [] index = new int [2];
	   int i = 0;
	   List <WebElement> dayList = (List<WebElement>) driver.findElement(By.xpath("//div[@class='react-datepicker__week']/div"));
	for (WebElement e : dayList) {
		if (e.getText().equals(1));{
			index[i] = dayList.indexOf(e);
			i++;
		}
		
	}
	for (int k = index[0];k < index[1] - 1;k++);
	int k;
//	//if(dayList.get(k).getText().equals(newday)) {
//		
//	}
   }  
   
}
