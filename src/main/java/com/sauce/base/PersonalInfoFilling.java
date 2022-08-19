package com.sauce.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalInfoFilling {
	
	private WebDriver driver;
	
	public PersonalInfoFilling(WebDriver driver) {
		this.driver = driver;
	}

	private WebElement getFirstNameField()
	{
		return driver.findElement(By.id("first-name"));
	}
	
	private WebElement getLastNameField()
	{
		return driver.findElement(By.id("last-name"));
	}
	
	private WebElement getPostalCodeField()
	{
		return driver.findElement(By.id("postal-code"));
	}
	
	public OverViewPage fillPersonalInfo(String firstName, String lastName, String postalCode)
	{
		getFirstNameField().sendKeys(firstName);
		getLastNameField().sendKeys(lastName);
		getPostalCodeField().sendKeys(postalCode);
		driver.findElement(By.id("continue")).click();
		return new OverViewPage(driver);	
	}
	
}
