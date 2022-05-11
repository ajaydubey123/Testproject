   package com.epicDMC.generic;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseLib {
     public WebDriver driver; //final driver
     
     @BeforeMethod
     @Parameters("browser")
     public void setUp(String browsername){
    	 if(browsername.equalsIgnoreCase("firefox")){
    		 System.setProperty("webdriver.gecko.driver", ".\\exefiles\\geckodriver.exe");
    		 driver= new FirefoxDriver();
    		// driver= new RemoteWebDriver(DesiredCapabilities.firefox());
    		 Reporter.log("firefox launched",true);
    		 
    		 
    	 }
    	 else if(browsername.equalsIgnoreCase("chrome")){
    		 System.setProperty("webdriver.chrome.driver", ".\\exefiles\\chromedriver.exe");
    		 driver=new ChromeDriver();
    		// driver= new RemoteWebDriver(DesiredCapabilities.chrome());

    		 Reporter.log("Chrome launched", true);
    	 }
    	 else if(browsername.equalsIgnoreCase("ie")){
    		 System.setProperty("webdriver.ie.driver", ".\\exeFiles\\IEDriverServer.exe");
    		 driver= new InternetExplorerDriver();
    		// driver= new RemoteWebDriver(DesiredCapabilities.internetExplorer());

    		 Reporter.log("IE launched",true);
    	 }
    	 
    	 driver.manage().window().maximize();
    	WaitStatementLib.implicitWaitForSeconds(driver, 60);
    	 driver.get(GetPropertiesValue.getPropertyValue("testURL"));
    	    	 Reporter.log("Navigated to url", true);
    	
     }
     
     @AfterMethod
     public void tearDown(ITestResult result){
	if(result.isSuccess()) {
		Reporter.log("script passed", true);
	}
	else {
		String filename=result.getMethod().getMethodName();
		ScreenshotLib slib= new ScreenshotLib();
		slib.getScreenshot(filename, driver);
		Reporter.log("Script failed", true);
	  Reporter.log("Screenshot has been taken", true);
	}
	   
		
    	 driver.close();
    	 Reporter.log("browser closed",true);
     }
     
     
     }
