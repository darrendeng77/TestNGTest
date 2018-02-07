package com.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gmail.BaseTest;

public class GmailLogin extends BaseTest{
	
	
	    //enter username
		@Test(priority=1)
		public void enterUserName() {
			lpl.enterUserName(userName);
			lpl.clickOnNext();
		}
		
		//enter password
		@Test(priority=2)
		public void enterPassWord() {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
			driver.findElement(By.id("password")).sendKeys(passWord);
			driver.findElement(By.id("passwordNext")).click();
		}
		
		//verify login
		@Test(priority=3)
		public void verifyLoginTitle() {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='#inbox']")));
			String expectedTitle = "Inbox";
			String actualTitle = driver.getTitle();
			System.out.println("====The title should be "+actualTitle);
			Assert.assertTrue(actualTitle.contains(expectedTitle));
		}
	

}
