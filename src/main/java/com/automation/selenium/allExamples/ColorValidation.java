package com.automation.selenium.allExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ColorValidation {
	public WebDriver driver;
	
	@BeforeTest
	public void startSession() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@AfterTest
	public void killSession() {
		driver.quit();
	}
	
	@Test
	public void verifyColourOfTheObject() {
		
		driver.get("http://the-internet.herokuapp.com/");
		WebElement element = driver.findElement(By.xpath("//img[@alt='Fork me on GitHub']"));
		
		List<WebElement> elements = driver.findElements(By.xpath("//img[@alt='Fork me on GitHub']"));
		
		System.out.println("Size of element ======" + element.getSize());
		System.out.println("Tag of element ======"+ element.getTagName());
		System.out.println("Text of element ====="+ element.getText());
		
		System.out.println("Attribute of element ======"+ element.getAttribute("alt"));
		
		System.out.println("Colour of element ======="+ element.getCssValue("color"));
		
		Assert.assertEquals("rgba(43, 166, 203, 1)", element.getCssValue("color"));
	}

}
