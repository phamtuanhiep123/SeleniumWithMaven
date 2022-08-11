package tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import common.TestBase;

public class TestCase {
	TestBase testBase = new TestBase ();
   @BeforeMethod
 public void openBrowser () {
	 testBase.openWebBrower();
 }
//   @AfterMethod
	public void closeBrower () {
		testBase.driver.quit();
	}
}
