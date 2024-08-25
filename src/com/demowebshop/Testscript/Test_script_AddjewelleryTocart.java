package com.demowebshop.Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.demowebshop.baseclass.Baseclass;

public class Test_script_AddjewelleryTocart extends Baseclass{
	@Test
	public void addjewToCart() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='top-menu']/li[6]"))));
		Thread.sleep(1000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//a[contains(text(),'Black ')]"));
		 Thread.sleep(1000);
		 JavascriptExecutor js1 =(JavascriptExecutor)driver;
		 js1.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(1000);
		 
		
		 driver.findElement(By.xpath("//input[@value='Add to wishlist']")).click();
		
		 Thread.sleep(1000);
		 JavascriptExecutor js2 =(JavascriptExecutor)driver;
		 js2.executeScript("window.scrollBy(0,-500)");
		 Thread.sleep(1000);
		 
	     driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		 
	     wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='addtocart']")))).click();
		 driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		 }
		}
		
	
	


