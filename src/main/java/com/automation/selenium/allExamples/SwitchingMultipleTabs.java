package com.automation.selenium.allExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingMultipleTabs {
	public WebDriver driver;
	
	@BeforeTest
	public void startSession() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void killSession() {
		driver.quit();
	}
	
	//@Test
	public void switchToNewTabOrWindow() {
		driver.findElement(By.xpath("//*[text()='Multiple Windows']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//*[text()='Click Here']"), 1));
		
		String parentWindowId = driver.getWindowHandle();
		
		System.out.println("Parent Window======"+ driver.getWindowHandle());
		
		driver.findElement(By.xpath("//*[text()='Click Here']")).click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		
		System.out.println("Total number of windows========"+ driver.getWindowHandles());
		
		for(String childWindow: driver.getWindowHandles()) {
			System.out.println("childWindow in loop ====="+ childWindow);
			driver.switchTo().window(childWindow);
			
		}
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='New Window']")).isDisplayed());
		System.out.println("Test");
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Click Here']")).isDisplayed());
	}
	
	@Test
	public void testMultiWindowpop() {
		driver.get("https://www.naukri.com/");
		
		System.out.println("Total number of windows========"+ driver.getWindowHandles());
		
		for(String childWindow: driver.getWindowHandles()) {
			System.out.println("childWindow in loop ====="+ childWindow);
			driver.switchTo().window(childWindow);
			
		}
		
		driver.close();
		
		
	}

}
