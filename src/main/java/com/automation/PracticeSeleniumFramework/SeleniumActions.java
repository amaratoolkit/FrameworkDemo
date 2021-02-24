package com.automation.PracticeSeleniumFramework;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumActions {
	WebDriver driver;
	
	public SeleniumActions(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void waitAndClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void typeValueInTextBox(WebElement element, String data) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(data);
	}
	
	public void selectValueFromDropDown(WebElement element, String type_value, String data) {
		Select select = new Select(element);
		switch(type_value) {
		case "byValue":
			select.selectByValue(data);
		case "byText":
			select.selectByVisibleText(data);
		default:
			System.out.println("No other combination");
		}
	
	}
	
	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForElement_F(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
