package com.automation.selenium.allExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LauchBrowser {

	WebDriver driver;

	@Test
	public void startBrowser() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.gecko.driver", "/Users/sivareddyk/Documents/APK/drivers/geckodriver");
		driver = new FirefoxDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		driver.findElement(By.className("login")).click();  // click on Sign IN
		
		//driver.findElement(By.id("email")).sendKeys("ayesha@yopmail.com");
		
		//driver.findElement(By.name("email")).sendKeys("ayesha@yopmail.com");
		
		driver.findElement(By.className("is_required validate account_input form-control")).sendKeys("ayesha@yopmail.com");
		
		
		
		System.out.println("Successfully enetered email");
	

		driver.quit();
	}
	
	
	//@Test
	public void abTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@href='/abtest']")).click();

	}

}
