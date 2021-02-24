package com.automation.selenium.allExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationTest {

	public WebDriver driver;
	
	@BeforeTest
	public void startSession() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@AfterTest
	public void killSession() {
		driver.quit();
	}
	
	@Test
	public void testBasicAuth() {
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth/");
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Basic Auth']")).isDisplayed());
		
	}
}
