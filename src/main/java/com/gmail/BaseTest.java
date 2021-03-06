package com.gmail;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	

	//create instance
	WebDriver driver = new FirefoxDriver();
	ReadProperties rp =  new ReadProperties();
	loginPageLocator lpl = new loginPageLocator(driver);
	String uRL = rp.getURL();
	String userName = rp.getUserName();
    String passWord = rp.getPassWord();
	WebDriverWait wait = new WebDriverWait(driver, 20);
    
	
	//start browser
	@BeforeClass
	public void startBrowser() {
		driver.get(uRL);
		driver.manage().window().maximize();	
		//following js code is use to scroll the page
		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	//close browser
		@AfterClass
		public void closeBrowser() {
			driver.quit();
    }

}
