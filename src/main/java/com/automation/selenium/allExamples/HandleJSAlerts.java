package com.automation.selenium.allExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJSAlerts {
	public WebDriver driver;
	
	@BeforeTest
	public void startSession() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space()='JavaScript Alerts']")).click();
	}
	
	@AfterTest
	public void killSession() {
		driver.quit();
	}
	
	@Test(priority = 2)
	public void verifyAcceptAlert() {
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		System.out.println("Test");
	}
	
	@Test(priority = 3)
	public void verifyDismissAlert() {
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.dismiss();
		
		System.out.println("Test");
	}
	
	@Test(priority = 1)
	public void typeValueAndVerifyAlert() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Alert alert = driver.switchTo().alert();
		//because of the alert using the sleep
		
		Thread.sleep(5000);
		
		alert.sendKeys("Automation");
		
		Thread.sleep(5000);
		
		alert.accept();
		
		System.out.println("Test");
	}

}
