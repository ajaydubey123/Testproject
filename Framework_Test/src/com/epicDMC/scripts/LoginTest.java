package com.epicDMC.scripts;

import org.testng.annotations.Test;

import com.epicDMC.generic.ExcelUtils;
import com.epicDMC.generic.WaitStatementLib;
import com.epicDMC.generic.BaseLib;
import com.epicDMC.pageobjects.IndexPage;
import com.epicDMC.pageobjects.LoginPage;

public class LoginTest extends BaseLib{
	@Test(priority=1)
	public void validLogintest() {
	LoginPage lp= new LoginPage(driver);
	String username=ExcelUtils.readData("TestData", 1, 1);
	String password=ExcelUtils.readData("TestData", 1, 2);
    lp.login(username, password);
    IndexPage ip= new IndexPage(driver);
    ip.toVerifyHomePageTitle(driver);
    ip.toVerifyURL(driver);
    }
	
	@Test(priority=2)
	public void invalidLoginTest() {
		LoginPage lp= new LoginPage(driver);
		String username=ExcelUtils.readData("TestData", 2, 1);
		String password=ExcelUtils.readData("TestData", 2, 2);
		lp.login(username, password);
		lp.verifyInvalidLogin();
		
	}
	
}
