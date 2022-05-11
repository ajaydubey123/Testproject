package com.epicDMC.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {
	@FindBy(id="login-username")
	private WebElement usernameTextBox;
	@FindBy(id="login-password")
	private WebElement passwordTextBox;
	@FindBy(id="login")
	private WebElement loginButton;
	@FindBy(xpath="//span[text()='Invalid login attempt.']")
	private WebElement invalidLoginMsg;
	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	
	}
	public void login(String username, String password) {
		usernameTextBox.sendKeys(username);
		passwordTextBox.sendKeys(password);
		loginButton.click();
	}
	public void verifyInvalidLogin() {
		String expected="Invalid login attempt.";
		String actual= invalidLoginMsg.getText();
		Assert.assertEquals(actual, expected);
		Reporter.log("Invalid login has been verified", true);
		
	}

}
