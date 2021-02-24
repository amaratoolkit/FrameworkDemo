package com.automation.selenium.allExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropTest {
	

	public WebDriver driver;

	@BeforeTest
	public void startSession() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.get("http://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterTest
	public void killSession() {
		driver.quit();
	}

	@Test
	public void drapAndDropTesting() {
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("#column-b"));
		WebElement target = driver.findElement(By.cssSelector("#column-a"));
		act.dragAndDrop(source, target);
		
//		act.clickAndHold(source);
//		act.moveToElement(target);
//		act.release().perform();
		
		System.out.println("Test");
	}
}
