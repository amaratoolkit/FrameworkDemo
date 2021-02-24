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

public class VerifyBrowserNavigations {
public WebDriver driver;
	
	@BeforeTest
	public void startsession() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@AfterTest
	public void killSession() {
		driver.quit();
	}


	@Test(priority = 1)
	public void verifyBrowserNaviagtionBackward() {
		driver.findElement(By.cssSelector("a[title='Contact Us']")).click();
		Assert.assertEquals("Contact us - My Store", driver.getTitle());
		
		driver.navigate().back();
		Assert.assertEquals("My Store",driver.getTitle());
	}

	@Test(priority = 2)
	public void verifyBrowserNaviagteForward() {
		driver.navigate().forward();
		Assert.assertEquals("Contact us - My Store", driver.getTitle());
		
		driver.navigate().refresh();
		
		driver.navigate().to("http://the-internet.herokuapp.com/");
		
		
	}
	
	@Test(priority = 3)
	public void verifyTextOfTheElement() {
		String expectedWelcomeText = driver.findElement(By.xpath("//a[@href='/tinymce']")).getText();
		
		Assert.assertEquals("WYSIWYG Editor", expectedWelcomeText);
	}
	
	

}
