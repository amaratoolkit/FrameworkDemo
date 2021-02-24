package com.automation.selenium.allExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesAndRightClick {
	

	public WebDriver driver;

	@BeforeTest
	public void startSession() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterTest
	public void killSession() {
		driver.quit();
	}
	
	//@Test
	public void rightClickTest() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Context Menu' or @href='/context_menu']")).click();
		WebElement hotspot = driver.findElement(By.id("hot-spot"));

		Actions action = new Actions(driver);
		action.contextClick(hotspot).build().perform();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		System.out.println("Test");
	}
	
	@Test
	public void framesTest() {
		driver.get("http://the-internet.herokuapp.com/iframe");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		// differnt type of frames switching
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("mce_0_ifr"))));
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.cssSelector(".mce-content-body ")).clear();
		driver.findElement(By.cssSelector(".mce-content-body ")).sendKeys("Selenium Automation");
		
		System.out.println("Pause");
	}
}
