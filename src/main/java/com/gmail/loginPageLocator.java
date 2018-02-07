package com.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPageLocator {
	
	WebDriver driver;
	By userName = By.id("identifierId");
	By nextButton = By.id("identifierNext");
	
	//constructor
	public loginPageLocator(WebDriver driver) {
		this.driver=driver;
	}
	
	//enterUserName method
	public void enterUserName(String us) {
		driver.findElement(userName).sendKeys(us);
	}
	
	//click on next
	public void clickOnNext() {
		driver.findElement(nextButton).click();
	}


}
