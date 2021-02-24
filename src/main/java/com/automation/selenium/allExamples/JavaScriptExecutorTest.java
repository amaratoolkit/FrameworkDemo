package com.automation.selenium.allExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorTest {

	public WebDriver driver;

	@BeforeTest
	public void startSession() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterTest
	public void killSession() {
		driver.quit();
	}

	@Test
	public void testJS() {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('SubmitLogin').click();");
		
		
		System.out.println("Test");
	}
	
	@Test
	public void test() {
		driver.get("http://the-internet.herokuapp.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement abtestLink = driver.findElement(By.cssSelector("a[href='/abtest']"));
		js.executeScript("arguments[0].click();", abtestLink);
	}
}
