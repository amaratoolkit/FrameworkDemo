package com.automation.PracticeSeleniumFramework.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.PracticeSeleniumFramework.SeleniumActions;

public class HerokuHomePage {
	WebDriver driver;
	SeleniumActions seleniumActions;

	public HerokuHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		seleniumActions = new SeleniumActions(driver);
	}
	
	
	@FindBy(xpath = "//a[@href='/abtest']")
	private WebElement abtestLink;
	
	@FindBy(xpath = "//a[text()='Add/Remove Elements']")
	private WebElement addRemoveLink;
	
	@FindBy(xpath = "//button[@onclick='deleteElement()']")
	private List<WebElement> deleteButton;
	

	public void clickOnAbTestLink() {
		seleniumActions.waitAndClick(abtestLink);
	}
	
	public String getTitleOfHomePage() {
		return driver.getTitle();
	}
	
	public void clickOnAuthLink() {
		seleniumActions.click(abtestLink);
		seleniumActions.typeValueInTextBox(abtestLink, "Test");
		seleniumActions.click(addRemoveLink);
		seleniumActions.selectValueFromDropDown(abtestLink, "byText", "India");
		deleteButton.get(5).click();
	}
	

}
