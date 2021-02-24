package com.automation.javaExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterfaceWebDriver {

	public WebDriver driver;
	String browser = "firefox";
	//
	
	@Test
	public void test() {
		//System.setProperty("webdriver.chrome.driver", "/Users/sivareddyk/eclipse-workspace-Android/PracticeSeleniumFramework/browserDrivers/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "/Users/sivareddyk/eclipse-workspace-Android/PracticeSeleniumFramework/browserDrivers/geckodriver");
		
		if (browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		
		
		driver = new FirefoxDriver();
		} else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			
			driver = new ChromeDriver();
		}
		else {
			driver = new SafariDriver();
		}
		
		driver.quit();
	}
	
//	public static void main(String args[]) {
//		InterfaceWebDriver tw;
//		tw = new InterfaceWebDriver();
//	}
}
