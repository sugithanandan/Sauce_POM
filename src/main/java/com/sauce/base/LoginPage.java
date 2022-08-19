package com.sauce.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	private WebElement getUserNameField()
	{
		return driver.findElement(By.id("user-name"));
	}
	
	private WebElement getPasswordField()
	{
		return driver.findElement(By.id("password"));
	}
	
	public LoginPage navigate()
	{
		driver.get("https://www.saucedemo.com/");
		return this;
	}
	
	public HomePage loginSauceDemo(String userName,String password)
	{
		getUserNameField().sendKeys(userName);
		getPasswordField().sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		return new HomePage(driver);
	}

}
