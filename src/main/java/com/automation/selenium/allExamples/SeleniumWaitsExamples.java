package com.automation.selenium.allExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaitsExamples {

	public WebDriver driver;

	@BeforeTest
	public void startSession() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest
	public void killSession() {
		driver.quit();
	}

	
	@Test
	public void explicitwaits() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
		wait.until(ExpectedConditions.attributeContains(By.xpath("//a[text()='Digest Authentication']"), "href", "auth"));
		WebElement authElement = driver.findElement(By.xpath("//a[text()='Digest Authentication']"));
		
		wait.until(ExpectedConditions.attributeContains(authElement, "href", "auth"));
		
		
		//wait.until(ExpectedConditions.elementToBeClickable(authElement)).click();
		
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//a[text()='Digest Authentication']"), 5));
		
		System.out.println("Test");
	}
	
}
