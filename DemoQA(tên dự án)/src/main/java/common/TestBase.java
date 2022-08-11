package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	 public WebDriver driver;
	 public void openWebBrower () {
		 System.setProperty("webdriver.chrome.driver", "D:\\AutomationTest\\01Tools\\chromedriver.exe");
			// Type URL
		    driver = new ChromeDriver();
			driver.get("https://demoqa.com/");
			// chon element
			driver.manage().window().maximize();
	 }
	}
