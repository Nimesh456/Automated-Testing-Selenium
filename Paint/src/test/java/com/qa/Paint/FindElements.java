package com.qa.Paint;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindElements {
	public WebDriver driver = null;


@Before
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	
}

@Test
public void mousehover() throws InterruptedException, IOException {
	driver.get("https://www.youidraw.com/apps/painter/");
	Actions action = new Actions(driver);
	action.moveByOffset(100, 200).clickAndHold()
	.moveByOffset(0, 200).moveByOffset(0, -100).moveByOffset(200,-100).moveByOffset(-200,100).moveByOffset(20,100).release().perform();
	
	
}

@After
public void tearDown() {
	driver.quit();
}
}
