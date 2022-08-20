package com.sauce.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.base.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceE2ETest {
	
	private WebDriver driver;
	
	private LoginPage loginPage;
	
	
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Driver Launched Successfully.");
	}
	
	@Test
	public void firstTest() throws InterruptedException
	{
		
		Date start = new Date();
		System.out.println(start);
		
		loginPage = new LoginPage(driver);
		
		loginPage.navigate().loginSauceDemo("standard_user", "secret_sauce")
		.clickShoppingCart()
		.doCheckout()
		.fillPersonalInfo("a", "s", "12345")
		.clickFinish()
		.checkOrderCompletion("THANK YOU FOR YOUR ORDER");
		
		Thread.sleep(2000);
		
		Date end = new Date();
		System.out.println(end);
		
		System.out.println(end.getSeconds() - start.getSeconds() + " seconds has been utilized for this test");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Driver instance killed Successfully.");
	}

}
