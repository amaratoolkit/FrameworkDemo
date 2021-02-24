package com.automation.selenium.allExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleAndURL {
	public WebDriver driver;
	
	@BeforeTest
	public void startsession() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

	@Test(priority = 1)
	public void verifyURL() {
		String expetedURL = driver.getCurrentUrl();
		Assert.assertEquals("http://automationpractice.com/index.php", expetedURL);
	}
	
	@Test(priority = 2)
	public void verifyTitleOfThePage() {
		
		String expectedTitle = driver.getTitle();
		Assert.assertEquals("My Store",expectedTitle);
		
	}
	
	
	
	@AfterTest
	public void killSession() {
		driver.quit();
	}

}
