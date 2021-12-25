package com.Learning.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Learning.Base.BaseTest;

public class LoginTest extends BaseTest {
	
	
	@Test
	public void loginTest () throws InterruptedException {
		log.debug("Inside the loginTest()");
		driver.findElement(By.xpath(OR.getProperty("ROBOT_ICON"))).click();
		Thread.sleep(1000);
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("LOGIN_USERNAME"))),"Login element not present");
		Reporter.log("Url Navigation is completed");
		Thread.sleep(5000);
		
	}
	
	@Test
	public void colleagueLogin () throws InterruptedException {
		
		System.out.println(driver.findElement(By.xpath(OR.getProperty("LOGIN_USERNAME"))).isDisplayed());
		System.out.println(driver.findElement(By.xpath(OR.getProperty("LOGIN_USERNAME"))).isEnabled());
		log.debug("Inside the ColleagueTest()");
		
		driver.findElement(By.xpath(OR.getProperty("LOGIN_USERNAME"))).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath(OR.getProperty("LOGIN_USERNAME"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(OR.getProperty("LOGIN_USERNAME"))).sendKeys("mitraa02");
		Thread.sleep(10000);
		Actions action =new Actions (driver);
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(config.getProperty("SCO_USERNAME"));
		Thread.sleep(1000);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(config.getProperty("SCO_PWD"));
		Thread.sleep(1000);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.ENTER).perform();
		Reporter.log("Login is succesfull");
		
		
	}
	
	
	
	

}
