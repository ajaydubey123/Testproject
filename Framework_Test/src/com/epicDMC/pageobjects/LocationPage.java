package com.epicDMC.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationPage {
	@FindBy(id="txtLocationName")
	private WebElement locationNameTextBox;
	@FindBy(id="btnSaveLocation")
	private WebElement saveButton;
	@FindBy(xpath="//button[text()='Ok!']")
	private WebElement successMsg;
	public LocationPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	
	}
	public void toCreateLocation(String locationName) {
		locationNameTextBox.sendKeys(locationName);
		saveButton.click();
		successMsg.click();
	}

}
