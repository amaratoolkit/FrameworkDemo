package com.automation.selenium.allExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadTest {


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
	public void fileUploadTest() {
		driver.get("http://the-internet.herokuapp.com/upload");
		driver.findElement(By.name("file")).sendKeys("/Users/sivareddyk/Downloads/03-setup-install.pdf");
		
		System.out.println("Test");
		
		driver.get("http://automationpractice.com/index.php?controller=contact");
		
		driver.findElement(By.id("fileUpload")).sendKeys("/Users/sivareddyk/Downloads/03-setup-install.pdf");
		
		System.out.println("Test");
	}
	
	@Test
	public void keyPressTest() {
		driver.get("http://the-internet.herokuapp.com/key_presses");
		driver.findElement(By.xpath("//input[@id='target' or @type='text']")).sendKeys(Keys.LEFT_SHIFT);
		
		System.out.println("Test");
	}
	
	@Test
	public void drapAndDropTesting() {
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("#column-b"));
		WebElement target = driver.findElement(By.cssSelector("#column-a"));
		act.dragAndDrop(source, target);
		
		act.clickAndHold(source);
		act.moveToElement(target);
		act.release().perform();
		
		System.out.println("Test");
	}


}
