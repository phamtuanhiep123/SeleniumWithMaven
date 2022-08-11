package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;

public class TextBoxTest extends TestCase {
	@Test
	public void submitSuccesfully() {
		String userName = "HieppHAM";
		String userEmail = "phamtuanhiep123@gmail.com";
		String currentAddress = "1234";
		String permanentAddress = "1234";

		HomePage homePage = new HomePage(testBase.driver);
		homePage.scroll();
		ElementsPage elementsPage = homePage.clickonElements();
		TextBoxPage textBoxPage = elementsPage.clickonTextBox();
		textBoxPage.inputData(userName, userEmail, currentAddress, permanentAddress);
		textBoxPage.clickSubmits();
		Assert.assertTrue(textBoxPage.verifyData(textBoxPage.lbNameElement, userName));
		Assert.assertTrue(textBoxPage.verifyData(textBoxPage.lbEmailElement, userEmail));
		Assert.assertTrue(textBoxPage.verifyData(textBoxPage.lbCurrentAddressElement, currentAddress));
		Assert.assertTrue(textBoxPage.verifyData(textBoxPage.lbPermanentAddressElement, permanentAddress));
	}

}
