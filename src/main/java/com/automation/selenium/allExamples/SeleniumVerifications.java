package com.automation.selenium.allExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumVerifications {
	public WebDriver driver;
	
	
	@BeforeTest
	public void startSession() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void killSession() {
		driver.quit();
	}
	
	//@Test
	public void isElementDisplayed() {
		WebElement abtestLink = driver.findElement(By.xpath("//a[@href='/abtest']"));
		
		abtestLink.click();
		
		WebElement headingABTest = driver.findElement(By.xpath("//h3[text()='A/B Test Control']"));
		
		Assert.assertTrue(headingABTest.isDisplayed());
		
	}
	
	@Test 
	public void isElementSelected() {
//		WebElement checkboxsLint = driver.findElement(By.xpath("//a[@href='/checkboxes']"));
//		checkboxsLint.click();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.cssSelector(".login")).click();
		driver.findElement(By.cssSelector("#email_create")).sendKeys("shiv12742334536@yopmail.com");
		driver.findElement(By.cssSelector(".icon-user.left")).click();
		driver.findElement(By.cssSelector("#id_gender1")).click();
		
		driver.findElement(By.cssSelector("#id_gender2")).isSelected();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("#id_gender2")).isSelected());
		
		
		
	}

}
