package com.qa.Form;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class LoginElement {
	public WebDriver driver = null;
	public static ExtentReports report;
	public ExtentTest test;
	
	@BeforeClass
	public static void initial() {
		report = new ExtentReports("C:\\Users\\Admin\\Desktop\\Empty\\LoginTest.html", true);
	}
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@Test
	public void save() throws InterruptedException, IOException {
		//FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Empty\\LoginExcel.xlsx");
		//XSSFWorkbook workbook = new XSSFWorkbook(file);
		//XSSFSheet sheet = workbook.getSheetAt(0);
		test = report.startTest("Search Text");
		driver.get("http://thedemosite.co.uk/addauser.php");
		test.log(LogStatus.INFO, "Registration page opened");
		LoginLandingPage loginPage = PageFactory.initElements(driver, LoginLandingPage.class);
		loginPage.logins("TEST1235");
		test.log(LogStatus.INFO, "You have Signed Up");
		report.endTest(test);
		
	}
	
	@Test
	public void save2() throws InterruptedException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Empty\\LoginExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		test = report.startTest("Search Text");
		driver.get("http://thedemosite.co.uk/login.php");
		test.log(LogStatus.INFO, "You are in login page");
		LoginLandingPage loginPage = PageFactory.initElements(driver, LoginLandingPage.class);
		loginPage.logins("TEST1235");
		SuccessfulPage successfulPage = PageFactory.initElements(driver, SuccessfulPage.class);
		if(successfulPage.getMessage().getText().equals("**Successful Login**")) {
			test.log(LogStatus.PASS, "You have successfully logged in");
		} else {
		test.log(LogStatus.FAIL, "You have failed to login");
	}
		report.endTest(test);	
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@AfterClass
	public static void end() {
		report.flush();
	}
}
