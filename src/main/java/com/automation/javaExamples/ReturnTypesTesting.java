package com.automation.javaExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReturnTypesTesting {
	WebDriver driver;
	
	public WebElement elementName(String value) {
		return driver.findElement(By.name(value));
	}
	
	
	public String getTextHeading(WebElement ele) {
		return ele.getText();
		
	}
	
	public int numberOfElements() {
		return driver.findElements(By.xpath("")).size();
	}
	
	public List<WebElement> arrayOfElements() {
		return driver.findElements(By.id(""));
	}
	
	
//	public List<String> arrayOfElementsNo() {
//		return driver.findElements(By.id("")).get(0).getText();
//	}


}
