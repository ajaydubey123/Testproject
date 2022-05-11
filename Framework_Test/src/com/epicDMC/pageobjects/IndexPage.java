package com.epicDMC.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class IndexPage {
	@FindBy(id="menuLoacation")
	private WebElement locationMenuBtn;
	public IndexPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void toVerifyHomePageTitle(WebDriver driver) {
		String expected="Index";
		String actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
		Reporter.log("Home Page title is verified", true);
	}
	
	public void toVerifyURL(WebDriver driver) {
		String expected = "http://dbprod/EpicDMC/Dashboard/Index";
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		Reporter.log("URL is verified", true);
	}
	
	public void clickonLocationMenuBtn() {
		locationMenuBtn.click();
	}

	
}
