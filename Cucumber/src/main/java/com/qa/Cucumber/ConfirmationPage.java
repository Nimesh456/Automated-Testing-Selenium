package com.qa.Cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage {
	@FindBy(xpath ="//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914921\"]/div/h1")
	private WebElement softwareText;
	
	@FindBy(xpath ="//*[@id=\"wsb-element-00000000-0000-0000-0000-000451989411\"]/div/p/span/strong")
	private WebElement Text;
	
	public WebElement getMessage() {
		return softwareText;
	}
	
	public WebElement getMess() {
		return Text;
	}

}
