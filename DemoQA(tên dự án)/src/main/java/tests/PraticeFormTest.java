package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AutomationPracticeForm;
import pages.ElementsPage;
import pages.FormsPage;
import pages.HomePage;
import pages.TextBoxPage;

public class PraticeFormTest extends TestCase {
	//@Test
	public void submitDataPracticeForm() {
		String firstName  = "HieppHAM";
		String  lastName  = "HieppHAM";
		String userEmail = "phamtuanhiep123@gmail.com";
		String userNumber = "12345678";
		String permanentAddress = "1234";
		String subjects = "1234";
		String currentAddress = "1234";

		HomePage homePage = new HomePage(testBase.driver);
		homePage.scroll();
		FormsPage formsPage = homePage.clickonFroms();
		AutomationPracticeForm automationPracticeFromPage = formsPage.clickonPracticeFrom();
		automationPracticeFromPage.inputData(firstName, lastName, userEmail, userNumber, subjects, currentAddress);
		automationPracticeFromPage.clickSubmits();
		
}
}