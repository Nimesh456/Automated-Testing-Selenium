package com.qa.Form;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLandingPage {

	@FindBy(name = "username")
	private WebElement usernameentry;
	
	@FindBy(name = "password")
	private WebElement passwordentry;
	
	
	public void logins(String text) throws InterruptedException {
		usernameentry.sendKeys(text);
		passwordentry.sendKeys(text);
		passwordentry.submit();
	}
}
