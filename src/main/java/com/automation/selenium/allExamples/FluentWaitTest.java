package com.automation.selenium.allExamples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitTest {
	

	public WebDriver driver;

	@BeforeTest
	public void startSession() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.get("http://the-internet.herokuapp.com");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterTest
	public void killSession() {
		driver.quit();
	}

	@Test
	public void testFluent() {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.withMessage("Test failed due to loading issue")
				.ignoring(StaleElementReferenceException.class)
				.ignoring(NoSuchElementException.class);
		
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[normalize-space()='A/B Testing']"))));
		wait.until(ExpectedConditions.alertIsPresent());
	}

}
