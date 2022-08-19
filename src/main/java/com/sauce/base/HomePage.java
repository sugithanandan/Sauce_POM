package com.sauce.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	private WebElement getShoppingCartField()
	{
		return driver.findElement(By.xpath("//div/a[@class='shopping_cart_link']"));
	}

	
	public ShopCart clickShoppingCart()
	{
		getShoppingCartField().click();
		return new ShopCart(driver);
	}
}
