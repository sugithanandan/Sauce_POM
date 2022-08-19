package com.sauce.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopCart {
	
	private WebDriver driver;
	
	public ShopCart(WebDriver driver) {
		this.driver = driver;
	}
	
	private WebElement getCheckoutField()
	{
		return driver.findElement(By.cssSelector("#checkout"));
	}
	
	
	public PersonalInfoFilling doCheckout()
	{
		getCheckoutField().click();
		return new PersonalInfoFilling(driver);
	}
	

}
