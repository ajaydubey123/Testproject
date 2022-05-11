package com.epicDMC.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.epicDMC.generic.BaseLib;
import com.epicDMC.generic.ExcelUtils;
import com.epicDMC.pageobjects.IndexPage;
import com.epicDMC.pageobjects.LocationPage;
import com.epicDMC.pageobjects.LoginPage;

public class LocationTest extends BaseLib {

	@Test
	public void locationCreation() {
		LoginPage lp= new LoginPage(driver);
		String username=ExcelUtils.readData("TestData", 1, 1);
		String password=ExcelUtils.readData("TestData", 1, 2);
		lp.login(username, password);
		IndexPage ip= new IndexPage(driver);
		ip.clickonLocationMenuBtn();
		LocationPage loc= new LocationPage(driver);
		String locationName=ExcelUtils.readData("TestData", 3, 1);
		loc.toCreateLocation(locationName);
		Reporter.log("location created successfully", true);
				
	}
}
