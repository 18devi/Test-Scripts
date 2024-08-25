package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartcompareAmazon{

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.get("https://www.flipkart.com/");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//button[text()='✕']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samasungS23");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     Thread.sleep(2000);
	     WebElement text = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 5G (Lavender, 256 GB)']/../../div[2]/div[1]/div[1]/div[1]"));
	     String text1 = text.getText();
	     System.out.println(text1);
	     Thread.sleep(2000);
	     driver.get("https://www.amazon.in/");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samasungS23");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	     Thread.sleep(1000);
	     WebElement text2 = driver.findElement(By.xpath("//span[text()='Samsung Galaxy S23 5G (Lavender, 8GB, 256GB Storage)']/../../../../div[3]/div[1]/div[1]/div[1]/div[2]/a/span"));
	     String text3 = text2.getText();
	     System.out.println(text3);
	     
	     if(text1.equals(text3))
	     {
	    	 System.out.println("price is equal");
	     }
	     else
	     {
	    	 System.out.println("price is not equals");
	     }
	     
	     	
	  }
   }
