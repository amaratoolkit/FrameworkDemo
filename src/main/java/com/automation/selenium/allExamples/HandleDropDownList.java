package com.automation.selenium.allExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownList {
	
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
	public void selectCountryFromList() {
		driver.navigate().to("https://www.salesforce.com/uk/form/signup/freetrial-sales-pe/");
		
		driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
		
		Select countryDropDown = new Select(driver.findElement(By.name("CompanyCountry"))); 
		
//		countryDropDown.selectByIndex(8);
//		countryDropDown.selectByValue("CL");
		countryDropDown.selectByVisibleText("India");
		
		System.out.println("Test");
		
		String countyName = countryDropDown.getFirstSelectedOption().getText();
		
		Assert.assertEquals("India", countyName);
		
		int numberOfCountries = countryDropDown.getOptions().size();
		System.out.println("number of countires ====="+ numberOfCountries);
		
		Assert.assertEquals(231, numberOfCountries);
	}

}
