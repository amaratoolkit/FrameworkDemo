package com.automation.selenium.allExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaits {
	public WebDriver driver;
	
	@BeforeTest
	public void startSession() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.navigate().to("http://automationpractice.com/index.php");
		
	}
	
	@AfterTest
	public void killSession() {
		driver.quit();
	}
	
	@Test
	public void verifyUsingWaits() {
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Status Codes']"))));
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("Test@yopmail.com");
	}
	
}
