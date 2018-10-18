package com.qa.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;



import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	public WebDriver driver = null;
	//public static ExtentReports report;
	//public ExtentTest test;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@Given("^the correct web address$")
	public void the_correct_web_address() {
		System.out.println("This step opens the browser and launches the website.");
		driver.get("http://www.practiceselenium.com/welcome.html");
	}
	
	@When("^I navigate to the 'Menu' page$")
	public void navigate_to_the_Menu_page()  {
	System.out.println("This step naviagtes to the menu page");
	driver.get("http://www.practiceselenium.com/menu.html");
	ConfirmationPage confirmation = PageFactory.initElements(driver, ConfirmationPage.class);
	confirmation.getMessage().getText().equals("Menu");
	}
	

	@Then("^I can browse a list of the available products\\\\.$")
	public void i_can_browse_a_list_of_the_available_products() {
	System.out.println("This step shows the list of available products");
	driver.get("http://www.practiceselenium.com/menu.html");
}
	
	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://www.practiceselenium.com/welcome.html");
	driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[5]/a")).click();
		
	} 
	
	
	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() {
		driver.get("http://www.practiceselenium.com/welcome.html");
		ConfirmationPage confirmation = PageFactory.initElements(driver, ConfirmationPage.class);
		confirmation.getMess().getText().equals("Pay with Credit Card or Log In");
		
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	

}
