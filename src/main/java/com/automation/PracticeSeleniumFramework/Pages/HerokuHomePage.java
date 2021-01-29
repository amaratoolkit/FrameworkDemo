package com.automation.PracticeSeleniumFramework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuHomePage {
	WebDriver driver;

	public HerokuHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	@FindBy(xpath = "//a[@href='/abtest']")
	private WebElement abtestLink;
	
	@FindBy(xpath = "//a[text()='Add/Remove Elements']")
	private WebElement addRemoveLink;
	

	public void clickOnAbTestLink() {
		abtestLink.click();
	}
	
	public String getTitleOfHomePage() {
		return driver.getTitle();
	}

}
