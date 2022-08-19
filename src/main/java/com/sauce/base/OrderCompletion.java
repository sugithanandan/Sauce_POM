package com.sauce.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderCompletion {
	
	private WebDriver driver;
	
	public OrderCompletion(WebDriver driver) {
		this.driver=driver;
	}

	private WebElement getOrderCompletionField()
	{
		return driver.findElement(By.xpath("//h2[@class='complete-header']"));
	}
	
	public void checkOrderCompletion(String expecteedMessage)
	{
		String actualMessge = getOrderCompletionField().getText();
		
		if(actualMessge.equalsIgnoreCase(expecteedMessage))
		{
			 new HomePage(driver);
		}
		
	} 
}
