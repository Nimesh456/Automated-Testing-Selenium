package com.qa.wait;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitTest {
	public WebDriver driver = null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		

	}
	

	@Test
	public void searchText() throws InterruptedException, IOException {
		driver.get("https://chrisperrins95.github.io/AutomatedTestingExample/");
		main waitpage = PageFactory.initElements(driver, main.class);
		System.out.println(waitpage.getElement(driver).getText());

}
	
	@After
	public void teardown() {
		driver.close();
	}
} 