package com.automation.PracticeSeleniumFramework.ABTest;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automation.PracticeSeleniumFramework.BaseAutomation;
import com.automation.PracticeSeleniumFramework.Pages.ABTestPage;
import com.automation.PracticeSeleniumFramework.Pages.HerokuHomePage;



public class VerifyABTest extends BaseAutomation{
	
	public HerokuHomePage herokuHomePage;
	public ABTestPage abTestPage;
	
	@BeforeClass
	public void initilazePages() {
		herokuHomePage = new HerokuHomePage(driver);
		abTestPage = new ABTestPage(driver);
	}
	
	@Test
	public void verifyABTestLIink() {
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals("The Internet", herokuHomePage.getTitleOfHomePage());
		herokuHomePage.clickOnAbTestLink();
		String actualHeading = abTestPage.getTextOfABTestHeading();
		softAssert.assertEquals("A/B Test Variant 1", actualHeading);
		softAssert.assertEquals("A/B Test Control", actualHeading);
		abTestPage.naviagteBackToHomePage();		
		softAssert.assertAll();
	}

}
