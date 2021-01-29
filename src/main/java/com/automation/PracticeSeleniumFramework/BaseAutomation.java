package com.automation.PracticeSeleniumFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseAutomation {
	public WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@BeforeTest
	public void launchApplication() {
		driver.get("http://the-internet.herokuapp.com/");
	}
	
	
	@AfterSuite
	public void killSession() {
		driver.quit();
	}

}
