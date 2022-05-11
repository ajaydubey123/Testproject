package com.epicDMC.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatementLib {
	public static void iSleep(WebDriver driver, int sec) {
		int millisec=sec*1000;
		try {
		Thread.sleep(millisec);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
     /*************end of iSleep****************************************/
	
	
	public static void implicitWaitForSeconds(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
		
	}
	/*************end of implicitWaitForSeconds**************************/
	
	public static void implicitWaitForMinutes(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
	}
	
	/************end of implicitWaitForMinutes****************************/
	
	public static void explicitWaitForVisibility(WebDriver driver, int time, WebElement ele) {
		WebDriverWait wait= new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	/*************end of explicitWaitForVisibility*************************/
	
	public static void explicitWaitForClickable(WebDriver driver, int time, WebElement ele) {
	   WebDriverWait wait= new WebDriverWait(driver, time);
	   wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	/**************end of explicitWaitForClickable**************************/
}
