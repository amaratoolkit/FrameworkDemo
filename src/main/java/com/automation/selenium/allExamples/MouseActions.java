package com.automation.selenium.allExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public WebDriver driver;

	@BeforeTest
	public void startSession() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterTest
	public void killSession() {
		driver.quit();
	}

	@Test
	public void mouseMoveAndClick() {
		driver.findElement(By.cssSelector("a[href='/hovers']")).click();

		Actions mouseActions = new Actions(driver);

		List<WebElement> images = driver.findElements(By.cssSelector("img[alt='User Avatar']"));
		
		WebElement sourceEle = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
		WebElement destEle = driver.findElement(By.xpath("//div[@class='example']//div[1]//div[1]//a[1]"));
		
		mouseActions.moveToElement(sourceEle).perform();
		System.out.println("Test");
		
		mouseActions.moveToElement(sourceEle).perform();
		mouseActions.moveToElement(destEle).click().perform();
		
		System.out.println("Test");
	}

}
