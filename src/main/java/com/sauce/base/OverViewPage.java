package com.sauce.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverViewPage {

	private WebDriver driver;
	
	public OverViewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private WebElement getFinishField()
	{
		return driver.findElement(By.id("finish"));
	}
	
	
	public OrderCompletion clickFinish()
	{
		getFinishField().click();
		
		return new OrderCompletion(driver);
	}
	
	
}
