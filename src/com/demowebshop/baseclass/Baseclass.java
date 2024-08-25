package com.demowebshop.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	public WebDriver driver;
	public WebDriverWait wait;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		wait=new WebDriverWait(driver, 5);
	}
	  @AfterMethod
	  public void closeApp()
	  {
		  driver.quit();
	  }
	
		
	}


