package com.automation.PracticeSeleniumFramework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ABTestPage {
	WebDriver driver;
	public ABTestPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//div[@class='example']/h3")
	private WebElement abTestHeading;
	
	
	public String getTextOfABTestHeading() {
		return abTestHeading.getText();
	}
	
	public void naviagteBackToHomePage() {
		driver.navigate().back();
	}

}
