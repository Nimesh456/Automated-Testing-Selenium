package com.qa.Form;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessfulPage {
	@FindBy(xpath ="/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	private WebElement softwareText;
	
	public WebElement getMessage() {
		return softwareText;
	}
	

}
