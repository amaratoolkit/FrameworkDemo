package com.automation.selenium.allExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElements {

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
	public void handleMultipleSameElements() throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='Add/Remove Elements']")).click();

		WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));

//		WebElement deleteElement = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
//		deleteElement.isDisplayed();
//		assertTrue(deleteElement.isDisplayed());
//		

		for (int i = 0; i < 5; i++) {
			addElement.click();
		}

		// System.out.println("size of delete button" + deleteElement.getSize());

		List<WebElement> multipleDeleteButton = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));

//		System.out.println("List of elements"+ multipleDeleteButton);
//		
//		System.out.println("list of delete button ========" + multipleDeleteButton.size());
//
//		Assert.assertEquals(5, multipleDeleteButton.size());
//		
		Thread.sleep(5);
		for (int j = 0; j < multipleDeleteButton.size(); j++) {
			multipleDeleteButton.get(j).click();
		}

		Thread.sleep(5);
		
		int sizeOFDeleteButton = multipleDeleteButton.size();
//
//		try {
//			multipleDeleteButton.get(0).isDisplayed();
//		} catch (StaleElementReferenceException see) {
//			see.printStackTrace();
//			assertFalse(driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).isDisplayed());
//		}

		System.out.println("List of delete button after deleted"+ sizeOFDeleteButton);

	}

}
